package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(4);
    public final String f44123a;
    public final int f44124b;
    public final String f44125c;

    public d(String str, int i10, String str2) {
        this.f44123a = str;
        this.f44124b = i10;
        this.f44125c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f44123a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f44124b);
        f5.l(parcel, 4, this.f44125c);
        f5.r(parcel, q10);
    }
}
