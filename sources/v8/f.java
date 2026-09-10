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
    public String f43239a;
    public String f43240b;
    public String f43241c;
    public String d;
    public String e;
    public String f43242f;
    public String h;
    public String f43243n;
    public String f43244r;
    public String f43245s;
    public int v;
    public ArrayList f43246w;
    public w8.f f43247x;
    public ArrayList f43248y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43239a);
        e0.l(parcel, 3, this.f43240b);
        e0.l(parcel, 4, this.f43241c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f43242f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f43243n);
        e0.l(parcel, 10, this.f43244r);
        e0.l(parcel, 11, this.f43245s);
        int i11 = this.v;
        e0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        e0.p(parcel, 13, this.f43246w);
        e0.k(parcel, 14, this.f43247x, i10);
        e0.p(parcel, 15, this.f43248y);
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
