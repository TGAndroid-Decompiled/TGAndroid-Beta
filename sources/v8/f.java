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
    public String f48709a;
    public String f48710b;
    public String f48711c;
    public String d;
    public String e;
    public String f48712f;
    public String h;
    public String f48713n;
    public String f48714r;
    public String f48715s;
    public int v;
    public ArrayList f48716w;
    public w8.f f48717x;
    public ArrayList f48718y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48709a);
        f0.l(parcel, 3, this.f48710b);
        f0.l(parcel, 4, this.f48711c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f48712f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.f48713n);
        f0.l(parcel, 10, this.f48714r);
        f0.l(parcel, 11, this.f48715s);
        int i11 = this.v;
        f0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        f0.p(parcel, 13, this.f48716w);
        f0.k(parcel, 14, this.f48717x, i10);
        f0.p(parcel, 15, this.f48718y);
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
