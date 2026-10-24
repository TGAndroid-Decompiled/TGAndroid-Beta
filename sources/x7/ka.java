package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ka extends a9.a implements ma {
    public final ja V0(x6.b bVar, oa oaVar) {
        ja aVar;
        Parcel N0 = N0();
        int i10 = y.f50079a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        oaVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof ja) {
                aVar = (ja) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 10);
            }
        }
        P0.recycle();
        return aVar;
    }
}
