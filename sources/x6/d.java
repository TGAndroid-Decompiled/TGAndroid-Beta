package x6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import c8.nb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import q6.m;
public abstract class d {
    public static String f60399a;
    public static int f60400b;
    public static Boolean f60401c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f60399a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f60399a = Application.getProcessName();
            } else {
                int i7 = f60400b;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f60400b = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i7);
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
                        m.h(readLine);
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
                f60399a = str;
            }
        }
        return f60399a;
    }

    public static boolean b() {
        Boolean bool = f60401c;
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
                        throw new RuntimeException(nb.a("expected a non-null reference", objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f60401c = bool;
        }
        return bool.booleanValue();
    }
}
