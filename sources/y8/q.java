package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61099a;
    public String f61100b;
    public String f61101c;
    public String d;
    public String f61102e;
    public String f61103f;
    public String h;
    public String f61104n;
    public String f61105r;
    public boolean f61106s;
    public String f61107w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61099a);
        bc.l(parcel, 3, this.f61100b);
        bc.l(parcel, 4, this.f61101c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f61102e);
        bc.l(parcel, 7, this.f61103f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f61104n);
        bc.l(parcel, 10, this.f61105r);
        boolean z10 = this.f61106s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 12, this.f61107w);
        bc.s(parcel, r10);
    }
}
