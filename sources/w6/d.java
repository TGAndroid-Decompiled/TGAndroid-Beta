package w6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import b8.ff;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p6.m;
public abstract class d {
    public static String f57395a;
    public static int f57396b;
    public static Boolean f57397c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f57395a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f57395a = Application.getProcessName();
            } else {
                int i3 = f57396b;
                if (i3 == 0) {
                    i3 = Process.myPid();
                    f57396b = i3;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i3 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i3);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(sb3));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        m.g(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        b.a(bufferedReader2);
                        throw th;
                    }
                    b.a(bufferedReader);
                }
                f57395a = str;
            }
        }
        return f57395a;
    }

    public static boolean b() {
        Boolean bool = f57397c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke != null) {
                        bool = (Boolean) invoke;
                    } else {
                        throw new RuntimeException(ff.a("expected a non-null reference", objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f57397c = bool;
        }
        return bool.booleanValue();
    }
}
