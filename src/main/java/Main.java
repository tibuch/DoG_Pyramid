
import net.imagej.ImageJ;
import net.imagej.ImgPlus;
import sc.fiji.simplifiedio.SimplifiedIO;

public class Main {

	public static void main(String[] args) {
		final ImageJ ij = new ImageJ();
		ij.launch(args);
		final ImgPlus image = SimplifiedIO.openImage("https://imagej.net/images/blobs.gif");
		ij.ui().show(image);
	}

}
