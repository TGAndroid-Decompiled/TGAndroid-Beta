package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
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
    public String f48263a;
    public String f48264b;
    public String f48265c;
    public String d;
    public String e;
    public String f48266f;
    public String h;
    public String f48267n;
    public String f48268r;
    public String f48269s;
    public int v;
    public ArrayList f48270w;
    public w8.f f48271x;
    public ArrayList f48272y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48263a);
        f0.l(parcel, 3, this.f48264b);
        f0.l(parcel, 4, this.f48265c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f48266f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f48267n);
        f0.l(parcel, 10, this.f48268r);
        f0.l(parcel, 11, this.f48269s);
        int i11 = this.v;
        f0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        f0.p(parcel, 13, this.f48270w);
        f0.k(parcel, 14, this.f48271x, i10);
        f0.p(parcel, 15, this.f48272y);
        f0.l(parcel, 16, this.E);
        f0.l(parcel, 17, this.F);
        f0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        f0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.p(parcel, 20, this.I);
        f0.p(parcel, 21, this.J);
        f0.p(parcel, 22, this.K);
        f0.k(parcel, 23, this.L, i10);
        f0.r(parcel, q6);
    }
}
