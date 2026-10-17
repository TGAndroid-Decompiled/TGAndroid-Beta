package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class fg extends a9.a {
    public final kg V0(x6.b bVar, cg cgVar) {
        kg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f319c);
        int i10 = t.f51189a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        cgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        Parcelable.Creator<kg> creator = kg.CREATOR;
        if (P0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(P0);
        }
        kg kgVar = createFromParcel;
        P0.recycle();
        return kgVar;
    }
}
