package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(12);
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w8.c L;
    public String f49492a;
    public String f49493b;
    public String f49494c;
    public String d;
    public String f49495e;
    public String f49496f;
    public String h;
    public String f49497n;
    public String f49498r;
    public String f49499s;
    public int v;
    public ArrayList f49500w;
    public w8.f f49501x;
    public ArrayList f49502y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49492a);
        d0.l(parcel, 3, this.f49493b);
        d0.l(parcel, 4, this.f49494c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49495e);
        d0.l(parcel, 7, this.f49496f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49497n);
        d0.l(parcel, 10, this.f49498r);
        d0.l(parcel, 11, this.f49499s);
        int i11 = this.v;
        d0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        d0.p(parcel, 13, this.f49500w);
        d0.k(parcel, 14, this.f49501x, i10);
        d0.p(parcel, 15, this.f49502y);
        d0.l(parcel, 16, this.E);
        d0.l(parcel, 17, this.F);
        d0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        d0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.p(parcel, 20, this.I);
        d0.p(parcel, 21, this.J);
        d0.p(parcel, 22, this.K);
        d0.k(parcel, 23, this.L, i10);
        d0.r(parcel, q6);
    }
}
