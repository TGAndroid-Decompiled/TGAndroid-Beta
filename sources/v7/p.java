package v7;

import android.content.Context;
import android.util.Log;
public abstract class p {
    public static String a(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 7) {
                switch (i10) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131689612);
                    case 11:
                        return context.getString(2131689611);
                    case 12:
                        return context.getString(2131689609);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        return context.getString(2131689577);
                }
            }
            return context.getString(2131689610);
        }
        return context.getString(2131689608);
    }
}
