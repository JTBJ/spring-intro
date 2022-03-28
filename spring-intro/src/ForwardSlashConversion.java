
/**
 * @author James.Benton
 *
 */
public class ForwardSlashConversion {
	
	/**
	 * converts file path syntax to the syntax that corresponds
	 * to that which is expected for the class attribute in
	 * the bean element, residing in the spring container
	 * @param path
	 * @return
	 */
	public String convertToDots(String path) {
		return path.replaceFirst("/spring-intro/src/", "")
				.replaceFirst(".java", "")
				.replace('/', '.');
	}
	
	/**
	 * convert file path syntax to the syntax that corresponds
	 * to that which is expected in the applicationContext 
	 * constructor
	 * @param path
	 * @return
	 */
	/**
	 * @param path
	 * @return
	 */
	public String convertToSlash(String path) {
		return path.replaceFirst("/spring-intro/src/", "");
	}

	public static void main(String[] args) {
		String string = "/spring-intro/src/com/spring/introduction/xml_config/c_namespace/w/indexing/c-namespace-indexing-application-context.xml";
		System.out.println(new ForwardSlashConversion().convertToDots(string ));
		System.out.println(new ForwardSlashConversion().convertToSlash(string));
	}

}
