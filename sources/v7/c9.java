package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class c9 {
    public static t7.r f47899a;
    public static s7.e f47900b;

    public static ii.n4 a(Bitmap bitmap) {
        n6.l.i(bitmap, "image must not be null");
        try {
            s7.e eVar = f47900b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            s7.b.b(O0, bitmap);
            Parcel N0 = cVar.N0(O0, 6);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new ii.n4(L0);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static ii.n4 b(int i10) {
        try {
            s7.e eVar = f47900b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            O0.writeInt(i10);
            Parcel N0 = cVar.N0(O0, 1);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new ii.n4(L0);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static synchronized y8 c(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f47899a == null) {
                    f47899a = new t7.r(1);
                }
                y8Var = (y8) f47899a.O0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
