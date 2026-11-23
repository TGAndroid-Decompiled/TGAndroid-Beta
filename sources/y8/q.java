package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61144a;
    public String f61145b;
    public String f61146c;
    public String d;
    public String f61147e;
    public String f61148f;
    public String h;
    public String f61149n;
    public String f61150r;
    public boolean f61151s;
    public String f61152w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61144a);
        bc.l(parcel, 3, this.f61145b);
        bc.l(parcel, 4, this.f61146c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f61147e);
        bc.l(parcel, 7, this.f61148f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f61149n);
        bc.l(parcel, 10, this.f61150r);
        boolean z10 = this.f61151s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 12, this.f61152w);
        bc.s(parcel, r10);
    }
}
