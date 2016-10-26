/**
 * Created by Powell on 10/25/2016.
 */
public class Utils {

    public Utils()
    {

    }

    double randomNumD(double min, double max)
    {
        double range = (max - min);
        return (Math.random() * range) + min;
    }

    int randomNumInt(int min, int max)
    {
        int range = (max - min);
        return (int) ((Math.random() * range) + min);
    }

}
