package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class c9 {
    public static t7.r f44192a;
    public static s7.e f44193b;

    public static xa.c a(Bitmap bitmap) {
        n6.l.i(bitmap, "image must not be null");
        try {
            s7.e eVar = f44193b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            s7.b.b(O0, bitmap);
            Parcel N0 = cVar.N0(O0, 6);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new xa.c(L0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static xa.c b(int i10) {
        try {
            s7.e eVar = f44193b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            O0.writeInt(i10);
            Parcel N0 = cVar.N0(O0, 1);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new xa.c(L0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized y8 c(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f44192a == null) {
                    f44192a = new t7.r(1);
                }
                y8Var = (y8) f44192a.O0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
