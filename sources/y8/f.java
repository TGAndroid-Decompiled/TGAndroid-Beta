package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public z8.c M;
    public String f61098a;
    public String f61099b;
    public String f61100c;
    public String d;
    public String f61101e;
    public String f61102f;
    public String h;
    public String f61103n;
    public String f61104r;
    public String f61105s;
    public int f61106w;
    public ArrayList f61107x;
    public z8.f f61108y;

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
        bc.l(parcel, 11, this.f61105s);
        int i10 = this.f61106w;
        bc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        bc.p(parcel, 13, this.f61107x);
        bc.k(parcel, 14, this.f61108y, i7);
        bc.p(parcel, 15, this.E);
        bc.l(parcel, 16, this.F);
        bc.l(parcel, 17, this.G);
        bc.p(parcel, 18, this.H);
        boolean z10 = this.I;
        bc.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.p(parcel, 20, this.J);
        bc.p(parcel, 21, this.K);
        bc.p(parcel, 22, this.L);
        bc.k(parcel, 23, this.M, i7);
        bc.s(parcel, r10);
    }
}
