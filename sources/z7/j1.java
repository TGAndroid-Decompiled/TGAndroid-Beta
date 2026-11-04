package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class j1 extends b8.a implements l3 {
    public final l0 X0(z6.b bVar, n6 n6Var) {
        l0 aVar;
        Parcel P0 = P0();
        int i3 = x.f60126a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        n6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof l0) {
                aVar = (l0) queryLocalInterface;
            } else {
                aVar = new b8.a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 11);
            }
        }
        R0.recycle();
        return aVar;
    }
}
