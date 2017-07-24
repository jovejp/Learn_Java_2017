/**
 * Created by wower on 2017/7/24.
 */
public class Cone {

    public int getConeNum(int inParam) {
        int returnValue = 1;
        if (inParam ==1 || inParam == 2) {
            returnValue = 1;
        } else if(inParam == 3) {
            returnValue = 1 +getConeNum(inParam-2);
        } else {
            returnValue = getConeNum(inParam-1) + getConeNum(inParam-2);
        }
        return returnValue;
    }

    public int getConeNum1(int inParam) {
        int returnValue = 1;
        if (inParam ==1 || inParam == 2) {
            returnValue = 1;
        } else if(inParam >= 3) {
            returnValue = 1;
            for (int j=1; j<= inParam -2; j++) {
                returnValue = returnValue +getConeNum1(j);
            }
        }
        return returnValue;
    }
}
