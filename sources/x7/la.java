package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class la extends a9.a implements na {
    public final ka W0(x6.b bVar, pa paVar) {
        ka aVar;
        Parcel O0 = O0();
        int i10 = y.f45970a;
        O0.writeStrongBinder(bVar);
        O0.writeInt(1);
        paVar.writeToParcel(O0, 0);
        Parcel Q0 = Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
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
        Q0.recycle();
        return aVar;
    }
}
