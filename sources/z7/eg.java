package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class eg extends a9.a {
    public final jg X0(x6.b bVar, bg bgVar) {
        jg createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f318c);
        int i10 = t.f55087a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        Parcelable.Creator<jg> creator = jg.CREATOR;
        if (R0.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(R0);
        }
        jg jgVar = createFromParcel;
        R0.recycle();
        return jgVar;
    }
}
