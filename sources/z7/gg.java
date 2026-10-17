package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class gg extends a9.a implements ig {
    public final fg V0(x6.b bVar, lg lgVar) {
        fg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        int i10 = t.f51189a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        lgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof fg) {
                aVar = (fg) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 11);
            }
        }
        P0.recycle();
        return aVar;
    }
}
