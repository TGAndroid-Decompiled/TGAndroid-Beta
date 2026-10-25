package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ha extends a8.a implements ja {
    public final ga V0(y6.b bVar, la laVar) {
        ga aVar;
        Parcel N0 = N0();
        int i10 = x.f52371a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        laVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof ga) {
                aVar = (ga) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 11);
            }
        }
        P0.recycle();
        return aVar;
    }
}
