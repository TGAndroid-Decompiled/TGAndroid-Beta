package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f58525a;
    public String f58526b;
    public String f58527c;
    public i[] d;
    public f[] f58528e;
    public String[] f58529f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f58525a, i7);
        bc.l(parcel, 3, this.f58526b);
        bc.l(parcel, 4, this.f58527c);
        bc.o(parcel, 5, this.d, i7);
        bc.o(parcel, 6, this.f58528e, i7);
        bc.m(parcel, 7, this.f58529f);
        bc.o(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
