package w7;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;
public abstract class e8 {
    public static String f48120a;

    public static String a(LaunchActivity launchActivity) {
        String str;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        String str2 = f48120a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager2 = launchActivity.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager2.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager2.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager2.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f48120a = null;
        } else if (arrayList.size() == 1) {
            f48120a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = launchActivity.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str)) {
                    f48120a = str;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f48120a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f48120a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f48120a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f48120a = "com.google.android.apps.chrome";
            }
        }
        try {
            if ("com.sec.android.app.sbrowser".equalsIgnoreCase(f48120a) && (applicationInfo = (packageManager = ApplicationLoader.applicationContext.getPackageManager()).getApplicationInfo("com.android.chrome", 0)) != null && applicationInfo.enabled) {
                packageManager.getPackageInfo("com.android.chrome", 1);
                f48120a = "com.android.chrome";
            }
        } catch (Throwable unused2) {
        }
        return f48120a;
    }
}
