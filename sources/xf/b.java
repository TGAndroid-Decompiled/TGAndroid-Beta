package xf;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.view.WindowManager;
import org.telegram.messenger.g0;
public abstract class b {
    public static final int[] f58624a = new int[2];

    public static int a(Context context) {
        Typeface typeface = g0.f22580a;
        if (Settings.canDrawOverlays(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) {
                return 1;
            }
            return -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        int i3;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!z10) {
            Typeface typeface = g0.f22580a;
            if (Settings.canDrawOverlays(context)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    i3 = 2038;
                } else {
                    i3 = 2003;
                }
                layoutParams.type = i3;
                layoutParams.flags = 520;
                return layoutParams;
            }
        }
        i3 = 2;
        layoutParams.type = i3;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
