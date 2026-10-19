package u6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import n6.l;
import w7.x;
public abstract class d {
    public static String f47598a;
    public static int f47599b;
    public static Boolean f47600c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f47598a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f47598a = Application.getProcessName();
            } else {
                int i10 = f47599b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f47599b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str2 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            String readLine = bufferedReader.readLine();
                            l.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            b.a(bufferedReader2);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    b.a(bufferedReader);
                }
                f47598a = str;
            }
        }
        return f47598a;
    }

    public static boolean b() {
        Boolean bool = f47600c;
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
                        throw new RuntimeException(x.a(objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f47600c = bool;
        }
        return bool.booleanValue();
    }
}
