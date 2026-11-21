package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h f58521a;
    public String f58522b;
    public String f58523c;
    public i[] d;
    public f[] f58524e;
    public String[] f58525f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f58521a, i7);
        bc.l(parcel, 3, this.f58522b);
        bc.l(parcel, 4, this.f58523c);
        bc.o(parcel, 5, this.d, i7);
        bc.o(parcel, 6, this.f58524e, i7);
        bc.m(parcel, 7, this.f58525f);
        bc.o(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
