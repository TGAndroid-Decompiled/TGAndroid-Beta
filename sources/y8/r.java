package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f60542a;
    public final String f60543b;
    public final int f60544c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f60542a = str;
        this.f60543b = str2;
        this.f60544c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f60542a);
        yb.l(parcel, 3, this.f60543b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f60544c);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
