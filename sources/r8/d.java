package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.n(9);
    public h f46377a;
    public String f46378b;
    public String f46379c;
    public i[] d;
    public f[] e;
    public String[] f46380f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f46377a, i10);
        h0.l(parcel, 3, this.f46378b);
        h0.l(parcel, 4, this.f46379c);
        h0.o(parcel, 5, this.d, i10);
        h0.o(parcel, 6, this.e, i10);
        h0.m(parcel, 7, this.f46380f);
        h0.o(parcel, 8, this.h, i10);
        h0.r(parcel, q6);
    }
}
