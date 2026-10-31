package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class la extends a9.a implements na {
    public final ka X0(x6.b bVar, pa paVar) {
        ka aVar;
        Parcel P0 = P0();
        int i10 = y.f53409a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        paVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof ka) {
                aVar = (ka) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
            }
        }
        R0.recycle();
        return aVar;
    }
}
