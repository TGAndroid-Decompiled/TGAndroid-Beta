package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class fg extends a9.a implements hg {
    public final eg X0(x6.b bVar, kg kgVar) {
        eg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f318c);
        int i10 = t.f55087a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        kgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof eg) {
                aVar = (eg) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 11);
            }
        }
        R0.recycle();
        return aVar;
    }
}
