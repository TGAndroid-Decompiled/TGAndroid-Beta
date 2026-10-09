package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class la extends a9.a implements na {
    public final ka V0(x6.b bVar, pa paVar) {
        ka aVar;
        Parcel N0 = N0();
        int i10 = y.f51037a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        paVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
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
        P0.recycle();
        return aVar;
    }
}
