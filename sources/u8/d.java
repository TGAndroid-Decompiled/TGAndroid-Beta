package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f58480a;
    public String f58481b;
    public String f58482c;
    public i[] d;
    public f[] f58483e;
    public String[] f58484f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f58480a, i7);
        bc.l(parcel, 3, this.f58481b);
        bc.l(parcel, 4, this.f58482c);
        bc.o(parcel, 5, this.d, i7);
        bc.o(parcel, 6, this.f58483e, i7);
        bc.m(parcel, 7, this.f58484f);
        bc.o(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
