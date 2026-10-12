package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(10);
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w8.c L;
    public String f46876a;
    public String f46877b;
    public String f46878c;
    public String d;
    public String e;
    public String f46879f;
    public String h;
    public String f46880n;
    public String f46881r;
    public String f46882s;
    public int v;
    public ArrayList f46883w;
    public w8.f f46884x;
    public ArrayList f46885y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f46876a);
        g0.l(parcel, 3, this.f46877b);
        g0.l(parcel, 4, this.f46878c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.l(parcel, 7, this.f46879f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.f46880n);
        g0.l(parcel, 10, this.f46881r);
        g0.l(parcel, 11, this.f46882s);
        int i11 = this.v;
        g0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        g0.p(parcel, 13, this.f46883w);
        g0.k(parcel, 14, this.f46884x, i10);
        g0.p(parcel, 15, this.f46885y);
        g0.l(parcel, 16, this.E);
        g0.l(parcel, 17, this.F);
        g0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        g0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.p(parcel, 20, this.I);
        g0.p(parcel, 21, this.J);
        g0.p(parcel, 22, this.K);
        g0.k(parcel, 23, this.L, i10);
        g0.r(parcel, q6);
    }
}
