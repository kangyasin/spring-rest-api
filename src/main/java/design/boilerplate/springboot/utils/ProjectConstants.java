package design.boilerplate.springboot.utils;

import java.util.Locale;

/**
 * Created on February 2023
 *
 * @author Kangyasin
 */
public final class ProjectConstants {

	// FIXME : Customize project constants for your application.

	public static final String DEFAULT_ENCODING = "UTF-8";

	public static final String PROJECT_BASE_PACKAGE = "design.boilerplate.springboot";

	public static final Locale TURKISH_LOCALE = new Locale.Builder().build();
//  public static final Locale TURKISH_LOCALE = new Locale.Builder().setLanguage("tr").setRegion("TR").build();

	private ProjectConstants() {

		throw new UnsupportedOperationException();
	}

}
