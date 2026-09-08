package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class dg extends a9.a {
    public final ig W0(x6.b bVar, ag agVar) {
        ig createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f337c);
        int i10 = t.f51269a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel Q0 = Q0(obtain, 3);
        Parcelable.Creator<ig> creator = ig.CREATOR;
        if (Q0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(Q0);
        }
        ig igVar = createFromParcel;
        Q0.recycle();
        return igVar;
    }
}
