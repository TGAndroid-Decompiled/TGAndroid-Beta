package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String f58474a;
    public String f58475b;
    public String f58476c;
    public String d;
    public String f58477e;
    public b f58478f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f58474a);
        bc.l(parcel, 3, this.f58475b);
        bc.l(parcel, 4, this.f58476c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f58477e);
        bc.k(parcel, 7, this.f58478f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
