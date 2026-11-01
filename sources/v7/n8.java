package v7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class n8 {
    public static s7.e f50534a;

    public static k6.h a(Bitmap bitmap) {
        n6.l.h(bitmap, "image must not be null");
        try {
            s7.e eVar = f50534a;
            n6.l.h(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel P0 = cVar.P0();
            s7.b.b(P0, bitmap);
            Parcel O0 = cVar.O0(P0, 6);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new k6.h(M0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static k6.h b(int i10) {
        try {
            s7.e eVar = f50534a;
            n6.l.h(eVar, "IBitmapDescriptorFactory is not initialized");
            s7.c cVar = (s7.c) eVar;
            Parcel P0 = cVar.P0();
            P0.writeInt(i10);
            Parcel O0 = cVar.O0(P0, 1);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new k6.h(M0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
