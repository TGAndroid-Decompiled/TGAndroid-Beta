package v7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.m;
import k7.f8;
import k7.m8;
import k7.n8;
public abstract class e {
    public static boolean f45625a = false;
    public static int f45626b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (e.class) {
            try {
                m.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f45625a) {
                    return 0;
                }
                try {
                    w7.e a2 = m8.a(context);
                    try {
                        w7.a U0 = a2.U0();
                        m.h(U0);
                        f8.f9811a = U0;
                        g7.e W0 = a2.W0();
                        if (n8.f9948a == null) {
                            m.i(W0, "delegate must not be null");
                            n8.f9948a = W0;
                        }
                        f45625a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                f45626b = 2;
                            }
                            l6.b bVar = new l6.b(context);
                            Parcel M0 = a2.M0();
                            g7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i10 = f45626b;
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
                    } catch (RemoteException e6) {
                        throw new RuntimeException(e6);
                    }
                } catch (y5.f e10) {
                    return e10.f47083a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
