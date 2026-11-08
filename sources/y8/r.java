package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f59324a;
    public final String f59325b;
    public final int f59326c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f59324a = str;
        this.f59325b = str2;
        this.f59326c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59324a);
        xb.l(parcel, 3, this.f59325b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f59326c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
