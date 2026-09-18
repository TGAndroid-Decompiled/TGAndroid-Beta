package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;
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
    public String f44247a;
    public String f44248b;
    public String f44249c;
    public String d;
    public String e;
    public String f44250f;
    public String h;
    public String f44251n;
    public String f44252r;
    public String f44253s;
    public int v;
    public ArrayList f44254w;
    public w8.f f44255x;
    public ArrayList f44256y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44247a);
        e0.l(parcel, 3, this.f44248b);
        e0.l(parcel, 4, this.f44249c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f44250f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f44251n);
        e0.l(parcel, 10, this.f44252r);
        e0.l(parcel, 11, this.f44253s);
        int i11 = this.v;
        e0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        e0.p(parcel, 13, this.f44254w);
        e0.k(parcel, 14, this.f44255x, i10);
        e0.p(parcel, 15, this.f44256y);
        e0.l(parcel, 16, this.E);
        e0.l(parcel, 17, this.F);
        e0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        e0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.p(parcel, 20, this.I);
        e0.p(parcel, 21, this.J);
        e0.p(parcel, 22, this.K);
        e0.k(parcel, 23, this.L, i10);
        e0.r(parcel, q6);
    }
}
