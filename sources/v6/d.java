package v6;

import a8.ve;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import o6.l;
public abstract class d {
    public static String f50074a;
    public static int f50075b;
    public static Boolean f50076c;

    public static String a() {
        BufferedReader bufferedReader;
        if (f50074a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f50074a = Application.getProcessName();
            } else {
                int i10 = f50075b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f50075b = i10;
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
                f50074a = str;
            }
        }
        return f50074a;
    }

    public static boolean b() {
        Boolean bool = f50076c;
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
                        throw new RuntimeException(ve.a(objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f50076c = bool;
        }
        return bool.booleanValue();
    }
}
