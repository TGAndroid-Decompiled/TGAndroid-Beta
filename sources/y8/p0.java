package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f52035a;
    public final String f52036b;

    public p0(int i10, String str) {
        this.f52035a = i10;
        this.f52036b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52035a);
        w7.c0.l(parcel, 3, this.f52036b);
        w7.c0.r(parcel, q6);
    }
}
