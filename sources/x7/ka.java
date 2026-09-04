package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ka extends a9.a implements ma {
    public final ja W0(x6.b bVar, oa oaVar) {
        ja aVar;
        Parcel O0 = O0();
        int i10 = y.f49262a;
        O0.writeStrongBinder(bVar);
        O0.writeInt(1);
        oaVar.writeToParcel(O0, 0);
        Parcel Q0 = Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
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
        Q0.recycle();
        return aVar;
    }
}
