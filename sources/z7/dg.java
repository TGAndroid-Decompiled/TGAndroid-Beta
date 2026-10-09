package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class dg extends a9.a {
    public final ig V0(x6.b bVar, ag agVar) {
        ig createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f337c);
        int i10 = t.f54041a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        Parcelable.Creator<ig> creator = ig.CREATOR;
        if (P0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(P0);
        }
        ig igVar = createFromParcel;
        P0.recycle();
        return igVar;
    }
}
