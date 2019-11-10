import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HostLookup {

	public static void main(String[] args) throws UnknownHostException {
		if(args.length == 0) {
			System.out.println("no inet addres inserted!");
			System.exit(0);
		}
		else if(args.length == 1){
			InetAddress address = InetAddress.getByName(args[0]);
			System.out.println("nome host: " + address.getHostName());
		}
		else {
			if(args[1].equalsIgnoreCase("-all")){
				List<InetAddress> addresses = Arrays.asList(InetAddress.getAllByName(args[0]));
				addresses.stream().forEach(x-> System.out.println(x));
			}
		}
	}

}
