package r7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g7.f7;
import g7.l7;
import g7.m7;
import x5.l;
public abstract class e {
    public static boolean f47086a = false;
    public static int f47087b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat("null"));
                if (f47086a) {
                    return 0;
                }
                try {
                    s7.e a2 = l7.a(context);
                    try {
                        s7.a U0 = a2.U0();
                        l.h(U0);
                        f7.f7179a = U0;
                        c7.e W0 = a2.W0();
                        if (m7.f7314a == null) {
                            l.i(W0, "delegate must not be null");
                            m7.f7314a = W0;
                        }
                        f47086a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                f47087b = 2;
                            }
                            h6.b bVar = new h6.b(context);
                            Parcel M0 = a2.M0();
                            c7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e10) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i9 = f47087b;
                        if (i9 != 1) {
                            if (i9 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("e", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (u5.f e12) {
                    return e12.f48111a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
