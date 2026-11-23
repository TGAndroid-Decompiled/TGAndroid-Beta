package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String f58637a;
    public String f58638b;
    public int f58639c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f58637a);
        cc.l(parcel, 3, this.f58638b);
        int i10 = this.f58639c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.s(parcel, r10);
    }
}
