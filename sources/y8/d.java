package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f61178a;
    public String f61179b;
    public int f61180c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61178a);
        cc.l(parcel, 3, this.f61179b);
        int i10 = this.f61180c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.s(parcel, r10);
    }
}
