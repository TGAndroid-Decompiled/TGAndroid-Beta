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
    public String f49535a;
    public String f49536b;
    public String f49537c;
    public String d;
    public String f49538e;
    public String f49539f;
    public String h;
    public String f49540n;
    public String f49541r;
    public String f49542s;
    public int v;
    public ArrayList f49543w;
    public w8.f f49544x;
    public ArrayList f49545y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49535a);
        d0.l(parcel, 3, this.f49536b);
        d0.l(parcel, 4, this.f49537c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.f49538e);
        d0.l(parcel, 7, this.f49539f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.f49540n);
        d0.l(parcel, 10, this.f49541r);
        d0.l(parcel, 11, this.f49542s);
        int i11 = this.v;
        d0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        d0.p(parcel, 13, this.f49543w);
        d0.k(parcel, 14, this.f49544x, i10);
        d0.p(parcel, 15, this.f49545y);
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
