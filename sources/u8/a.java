package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(0);
    public int f56391a;
    public String[] f56392b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56391a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.m(parcel, 3, this.f56392b);
        xb.s(parcel, r10);
    }
}
