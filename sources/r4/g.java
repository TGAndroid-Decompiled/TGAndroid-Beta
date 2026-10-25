package r4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
public abstract class g {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
