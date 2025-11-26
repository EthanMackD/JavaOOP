package ie.atu.sw;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Runner {

	public static void main(String[] args) throws Exception {
		var algo = Algorithm.GZIP;
		var dir = Paths.get("backups");
		Files.createDirectories(dir);

		var files = List.of(
				new BackupFile("small." + algo.extension(), Files.readAllBytes(Path.of("small.txt"))),
				new BackupFile("medium." + algo.extension(), Files.readAllBytes(Path.of("medium.txt"))),
				new BackupFile("large." + algo.extension(), Files.readAllBytes(Path.of("large.txt")))

		);
		
		var compressor = new Compressor(Algorithm.GZIP);
		var task = new BackupTask(files, compressor, dir);
		task.execute();

	}

}
