package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
    public String f61098a;
    public String f61099b;
    public String f61100c;
    public String d;
    public String f61101e;
    public String f61102f;
    public String h;
    public String f61103n;
    public String f61104r;
    public boolean f61105s;
    public String f61106w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61098a);
        bc.l(parcel, 3, this.f61099b);
        bc.l(parcel, 4, this.f61100c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f61101e);
        bc.l(parcel, 7, this.f61102f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f61103n);
        bc.l(parcel, 10, this.f61104r);
        boolean z10 = this.f61105s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 12, this.f61106w);
        bc.s(parcel, r10);
    }
}
