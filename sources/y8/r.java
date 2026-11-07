package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f59234a;
    public final String f59235b;
    public final int f59236c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f59234a = str;
        this.f59235b = str2;
        this.f59236c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59234a);
        xb.l(parcel, 3, this.f59235b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f59236c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
