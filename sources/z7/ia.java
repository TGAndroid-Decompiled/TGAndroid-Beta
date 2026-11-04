package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ia extends b8.a implements ka {
    public final ha X0(z6.b bVar, ma maVar) {
        ha aVar;
        Parcel P0 = P0();
        int i3 = x.f60126a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        maVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof ha) {
                aVar = (ha) queryLocalInterface;
            } else {
                aVar = new b8.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 11);
            }
        }
        R0.recycle();
        return aVar;
    }
}
