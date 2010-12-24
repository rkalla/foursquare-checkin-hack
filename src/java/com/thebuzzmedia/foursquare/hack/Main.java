package com.thebuzzmedia.foursquare.hack;

import com.thebuzzmedia.foursquare.hack.ui.MainFrame;
import javax.swing.UIManager;

/**
 * Main class for launching the FourSquare hack GUI. Original idea and
 * implementation inspired by <a
 * href="http://compbio.cs.uic.edu/~mayank/4sq.html">Mayank Lahiri</a>.
 * <p/>
 * More information available <a href=
 * "http://www.thebuzzmedia.com/foursquare-mayor-checkin-program-w-source-code/"
 * >here</a>.
 * 
 * @author Riyad Kalla (software@thebuzzmedia.com)
 */
public class Main {
	public static final String EMAIL_PREF_KEY = "email";
	public static final String VENUE_ID_PREF_KEY = "vid";
	public static final String LATITUDE_PREF_KEY = "lat";
	public static final String LONGITUDE_PREF_KEY = "lng";

	public static final String HOSTNAME = "api.foursquare.com";
	public static final String API_URL = "http://" + HOSTNAME
			+ ":80/v1/checkin";
	public static final String USER_AGENT = "Mozilla/5.0 (iPhone; U; CPU like Mac OS X; en) AppleWebKit/420+ (KHTML, like Gecko) Version/3.0 Mobile/1C10 Safari/419.3";
	public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
	public static final String SUCCESSFUL_CHECKIN_DELIMITER = "<checkin><id>";

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			// no-op
		}

		new MainFrame().setVisible(true);
	}
}
