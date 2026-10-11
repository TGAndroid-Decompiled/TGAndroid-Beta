package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class eg extends a9.a {
    public final jg V0(x6.b bVar, bg bgVar) {
        jg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f337c);
        int i10 = t.f54136a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        Parcelable.Creator<jg> creator = jg.CREATOR;
        if (P0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(P0);
        }
        jg jgVar = createFromParcel;
        P0.recycle();
        return jgVar;
    }
}
