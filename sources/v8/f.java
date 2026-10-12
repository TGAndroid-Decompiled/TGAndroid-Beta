package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
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
    public String f49676a;
    public String f49677b;
    public String f49678c;
    public String d;
    public String f49679e;
    public String f49680f;
    public String h;
    public String f49681n;
    public String f49682r;
    public String f49683s;
    public int v;
    public ArrayList f49684w;
    public w8.f f49685x;
    public ArrayList f49686y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49676a);
        c0.l(parcel, 3, this.f49677b);
        c0.l(parcel, 4, this.f49678c);
        c0.l(parcel, 5, this.d);
        c0.l(parcel, 6, this.f49679e);
        c0.l(parcel, 7, this.f49680f);
        c0.l(parcel, 8, this.h);
        c0.l(parcel, 9, this.f49681n);
        c0.l(parcel, 10, this.f49682r);
        c0.l(parcel, 11, this.f49683s);
        int i11 = this.v;
        c0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        c0.p(parcel, 13, this.f49684w);
        c0.k(parcel, 14, this.f49685x, i10);
        c0.p(parcel, 15, this.f49686y);
        c0.l(parcel, 16, this.E);
        c0.l(parcel, 17, this.F);
        c0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        c0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.p(parcel, 20, this.I);
        c0.p(parcel, 21, this.J);
        c0.p(parcel, 22, this.K);
        c0.k(parcel, 23, this.L, i10);
        c0.r(parcel, q6);
    }
}
