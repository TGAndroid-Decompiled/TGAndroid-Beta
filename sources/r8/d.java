package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h f42102a;
    public String f42103b;
    public String f42104c;
    public i[] d;
    public f[] e;
    public String[] f42105f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.f42102a, i10);
        e0.l(parcel, 3, this.f42103b);
        e0.l(parcel, 4, this.f42104c);
        e0.o(parcel, 5, this.d, i10);
        e0.o(parcel, 6, this.e, i10);
        e0.m(parcel, 7, this.f42105f);
        e0.o(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}
