package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(4);
    public final String f47061a;
    public final int f47062b;
    public final String f47063c;

    public d(String str, int i10, String str2) {
        this.f47061a = str;
        this.f47062b = i10;
        this.f47063c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f47061a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f47062b);
        g5.l(parcel, 4, this.f47063c);
        g5.r(parcel, q10);
    }
}
