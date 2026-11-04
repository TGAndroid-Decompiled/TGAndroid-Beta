package z9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public abstract class g {
    public static final char[] f60179a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized long a(Context context) {
        long j10;
        synchronized (g.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        }
        return j10;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static boolean c(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int e10 = e(context, str, "bool");
            if (e10 > 0) {
                return resources.getBoolean(e10);
            }
            int e11 = e(context, str, "string");
            if (e11 > 0) {
                return Boolean.parseBoolean(context.getString(e11));
            }
        }
        return z10;
    }

    public static int d() {
        boolean g7 = g();
        ?? r02 = g7;
        if (h()) {
            r02 = (g7 ? 1 : 0) | true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return r02;
        }
        return r02 | 4;
    }

    public static int e(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i3 = context.getApplicationContext().getApplicationInfo().icon;
        if (i3 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i3);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b10 = bArr[i3];
            int i10 = i3 * 2;
            char[] cArr2 = f60179a;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean h() {
        boolean g7 = g();
        String str = Build.TAGS;
        if ((!g7 && str != null && str.contains("test-keys")) || t4.c.p("/system/app/Superuser.apk")) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!g7 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        String str;
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = "";
            }
            useDelimiter.close();
            return str;
        } catch (Throwable th2) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
