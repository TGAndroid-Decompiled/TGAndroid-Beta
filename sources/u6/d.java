package u6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import n6.l;
import w7.a0;
public abstract class d {
    public static String f50170a;
    public static int f50171b;
    public static Boolean f50172c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f50170a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f50170a = Application.getProcessName();
            } else {
                int i10 = f50171b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f50171b = i10;
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
                            l.g(readLine);
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
                f50170a = str;
            }
        }
        return f50170a;
    }

    public static boolean b() {
        Boolean bool = f50172c;
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
                        throw new RuntimeException(a0.a(objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f50172c = bool;
        }
        return bool.booleanValue();
    }
}
