package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.m(10);
    public h f45498a;
    public String f45499b;
    public String f45500c;
    public i[] d;
    public f[] e;
    public String[] f45501f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.f45498a, i10);
        f0.l(parcel, 3, this.f45499b);
        f0.l(parcel, 4, this.f45500c);
        f0.o(parcel, 5, this.d, i10);
        f0.o(parcel, 6, this.e, i10);
        f0.m(parcel, 7, this.f45501f);
        f0.o(parcel, 8, this.h, i10);
        f0.r(parcel, q6);
    }
}
