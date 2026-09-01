package v7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.m;
import k7.g8;
import k7.k8;
import k7.o8;
public abstract class e {
    public static boolean f48921a = false;
    public static int f48922b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (e.class) {
            try {
                m.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f48921a) {
                    return 0;
                }
                try {
                    w7.e a2 = k8.a(context);
                    try {
                        w7.a U0 = a2.U0();
                        m.h(U0);
                        g8.f10588a = U0;
                        g7.e W0 = a2.W0();
                        if (o8.f10685a == null) {
                            m.i(W0, "delegate must not be null");
                            o8.f10685a = W0;
                        }
                        f48921a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                f48922b = 2;
                            }
                            l6.b bVar = new l6.b(context);
                            Parcel M0 = a2.M0();
                            g7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e6) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e6);
                        }
                        int i10 = f48922b;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("e", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (y5.f e11) {
                    return e11.f50770a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
