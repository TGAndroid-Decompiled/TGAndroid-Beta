package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class c9 {
    public static t7.r f42960a;
    public static s7.e f42961b;

    public static a6.i a(Bitmap bitmap) {
        n6.l.i(bitmap, "image must not be null");
        try {
            s7.e eVar = f42961b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            s7.b.b(O0, bitmap);
            Parcel N0 = cVar.N0(O0, 6);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new a6.i(L0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static a6.i b(int i10) {
        try {
            s7.e eVar = f42961b;
            n6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel O0 = cVar.O0();
            O0.writeInt(i10);
            Parcel N0 = cVar.N0(O0, 1);
            x6.a L0 = x6.b.L0(N0.readStrongBinder());
            N0.recycle();
            return new a6.i(L0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized y8 c(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f42960a == null) {
                    f42960a = new t7.r(1);
                }
                y8Var = (y8) f42960a.O0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
