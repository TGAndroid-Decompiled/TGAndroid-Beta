package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class i1 extends a8.a implements k3 {
    public final l0 V0(y6.b bVar, m6 m6Var) {
        l0 aVar;
        Parcel N0 = N0();
        int i10 = x.f52371a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        m6Var.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof l0) {
                aVar = (l0) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 11);
            }
        }
        P0.recycle();
        return aVar;
    }
}
