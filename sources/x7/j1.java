package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class j1 extends a9.a implements l3 {
    public final m0 X0(x6.b bVar, n6 n6Var) {
        m0 aVar;
        Parcel P0 = P0();
        int i10 = y.f53427a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        n6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
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
        R0.recycle();
        return aVar;
    }
}
