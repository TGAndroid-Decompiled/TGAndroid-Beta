package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
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
    public String f61067a;
    public String f61068b;
    public String f61069c;
    public String d;
    public String f61070e;
    public String f61071f;
    public String h;
    public String f61072n;
    public String f61073r;
    public String f61074s;
    public int f61075w;
    public ArrayList f61076x;
    public z8.f f61077y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61067a);
        cc.l(parcel, 3, this.f61068b);
        cc.l(parcel, 4, this.f61069c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f61070e);
        cc.l(parcel, 7, this.f61071f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f61072n);
        cc.l(parcel, 10, this.f61073r);
        cc.l(parcel, 11, this.f61074s);
        int i10 = this.f61075w;
        cc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        cc.p(parcel, 13, this.f61076x);
        cc.k(parcel, 14, this.f61077y, i7);
        cc.p(parcel, 15, this.E);
        cc.l(parcel, 16, this.F);
        cc.l(parcel, 17, this.G);
        cc.p(parcel, 18, this.H);
        boolean z10 = this.I;
        cc.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.p(parcel, 20, this.J);
        cc.p(parcel, 21, this.K);
        cc.p(parcel, 22, this.L);
        cc.k(parcel, 23, this.M, i7);
        cc.s(parcel, r10);
    }
}
