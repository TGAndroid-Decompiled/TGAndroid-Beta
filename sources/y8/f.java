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
    public String f61186a;
    public String f61187b;
    public String f61188c;
    public String d;
    public String f61189e;
    public String f61190f;
    public String h;
    public String f61191n;
    public String f61192r;
    public String f61193s;
    public int f61194w;
    public ArrayList f61195x;
    public z8.f f61196y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61186a);
        cc.l(parcel, 3, this.f61187b);
        cc.l(parcel, 4, this.f61188c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f61189e);
        cc.l(parcel, 7, this.f61190f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f61191n);
        cc.l(parcel, 10, this.f61192r);
        cc.l(parcel, 11, this.f61193s);
        int i10 = this.f61194w;
        cc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        cc.p(parcel, 13, this.f61195x);
        cc.k(parcel, 14, this.f61196y, i7);
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
