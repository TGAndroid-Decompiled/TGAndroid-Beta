package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int f61102a;
    public String f61103b;
    public String f61104c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61102a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 2, this.f61103b);
        cc.l(parcel, 3, this.f61104c);
        cc.s(parcel, r10);
    }
}
