package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(10);
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public x8.c L;
    public String f51145a;
    public String f51146b;
    public String f51147c;
    public String d;
    public String e;
    public String f51148f;
    public String h;
    public String f51149n;
    public String f51150r;
    public String f51151s;
    public int v;
    public ArrayList f51152w;
    public x8.f f51153x;
    public ArrayList f51154y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51145a);
        df.l(parcel, 3, this.f51146b);
        df.l(parcel, 4, this.f51147c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f51148f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.f51149n);
        df.l(parcel, 10, this.f51150r);
        df.l(parcel, 11, this.f51151s);
        int i11 = this.v;
        df.s(parcel, 12, 4);
        parcel.writeInt(i11);
        df.p(parcel, 13, this.f51152w);
        df.k(parcel, 14, this.f51153x, i10);
        df.p(parcel, 15, this.f51154y);
        df.l(parcel, 16, this.E);
        df.l(parcel, 17, this.F);
        df.p(parcel, 18, this.G);
        boolean z10 = this.H;
        df.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.p(parcel, 20, this.I);
        df.p(parcel, 21, this.J);
        df.p(parcel, 22, this.K);
        df.k(parcel, 23, this.L, i10);
        df.r(parcel, q5);
    }
}
