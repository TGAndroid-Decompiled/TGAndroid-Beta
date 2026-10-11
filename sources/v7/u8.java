package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class u8 {
    public static s7.e f49413a;

    public static xa.c a(Bitmap bitmap) {
        n6.m.i(bitmap, "image must not be null");
        try {
            s7.e eVar = f49413a;
            n6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel N0 = cVar.N0();
            s7.b.b(N0, bitmap);
            Parcel M0 = cVar.M0(N0, 6);
            x6.a K0 = x6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new xa.c(K0);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static xa.c b(int i10) {
        try {
            s7.e eVar = f49413a;
            n6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel N0 = cVar.N0();
            N0.writeInt(i10);
            Parcel M0 = cVar.M0(N0, 1);
            x6.a K0 = x6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new xa.c(K0);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
