package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new u8.o(21);
    public int f61216a;
    public String f61217b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61216a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f61217b);
        cc.s(parcel, r10);
    }
}
