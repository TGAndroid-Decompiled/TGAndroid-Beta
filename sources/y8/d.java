package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(1);
    public String f61059a;
    public String f61060b;
    public int f61061c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61059a);
        cc.l(parcel, 3, this.f61060b);
        int i10 = this.f61061c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.s(parcel, r10);
    }
}
