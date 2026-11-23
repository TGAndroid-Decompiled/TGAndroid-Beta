package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f58605a;
    public String f58606b;
    public String f58607c;
    public i[] d;
    public f[] f58608e;
    public String[] f58609f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f58605a, i7);
        cc.l(parcel, 3, this.f58606b);
        cc.l(parcel, 4, this.f58607c);
        cc.o(parcel, 5, this.d, i7);
        cc.o(parcel, 6, this.f58608e, i7);
        cc.m(parcel, 7, this.f58609f);
        cc.o(parcel, 8, this.h, i7);
        cc.s(parcel, r10);
    }
}
