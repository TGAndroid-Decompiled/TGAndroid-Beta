package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
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
    public String f60491a;
    public String f60492b;
    public String f60493c;
    public String d;
    public String f60494e;
    public String f60495f;
    public String h;
    public String f60496n;
    public String f60497r;
    public String f60498s;
    public int f60499w;
    public ArrayList f60500x;
    public z8.f f60501y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f60491a);
        yb.l(parcel, 3, this.f60492b);
        yb.l(parcel, 4, this.f60493c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f60494e);
        yb.l(parcel, 7, this.f60495f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.f60496n);
        yb.l(parcel, 10, this.f60497r);
        yb.l(parcel, 11, this.f60498s);
        int i10 = this.f60499w;
        yb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        yb.p(parcel, 13, this.f60500x);
        yb.k(parcel, 14, this.f60501y, i7);
        yb.p(parcel, 15, this.E);
        yb.l(parcel, 16, this.F);
        yb.l(parcel, 17, this.G);
        yb.p(parcel, 18, this.H);
        boolean z10 = this.I;
        yb.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.p(parcel, 20, this.J);
        yb.p(parcel, 21, this.K);
        yb.p(parcel, 22, this.L);
        yb.k(parcel, 23, this.M, i7);
        yb.s(parcel, r10);
    }
}
