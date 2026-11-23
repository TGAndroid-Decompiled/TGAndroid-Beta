package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(0);
    public int f58592a;
    public String[] f58593b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f58592a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.m(parcel, 3, this.f58593b);
        cc.s(parcel, r10);
    }
}
