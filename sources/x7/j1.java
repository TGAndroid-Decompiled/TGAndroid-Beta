package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class j1 extends a9.a implements l3 {
    public final m0 V0(x6.b bVar, n6 n6Var) {
        m0 aVar;
        Parcel N0 = N0();
        int i10 = y.f51125a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        n6Var.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof m0) {
                aVar = (m0) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 10);
            }
        }
        P0.recycle();
        return aVar;
    }
}
