/*******************************************
 *
 * Author: Ryan McGuire
 * Date: 10/12/2018
 * Step 8
 *
 *
 *******************************************/

package productionline;

/**
 * Defines the details of the Screen type.
 */
public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();
}
