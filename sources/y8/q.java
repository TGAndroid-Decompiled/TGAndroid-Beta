package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61140a;
    public String f61141b;
    public String f61142c;
    public String d;
    public String f61143e;
    public String f61144f;
    public String h;
    public String f61145n;
    public String f61146r;
    public boolean f61147s;
    public String f61148w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61140a);
        bc.l(parcel, 3, this.f61141b);
        bc.l(parcel, 4, this.f61142c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f61143e);
        bc.l(parcel, 7, this.f61144f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f61145n);
        bc.l(parcel, 10, this.f61146r);
        boolean z10 = this.f61147s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 12, this.f61148w);
        bc.s(parcel, r10);
    }
}
