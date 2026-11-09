package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList D;
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public z8.c L;
    public String f59282a;
    public String f59283b;
    public String f59284c;
    public String d;
    public String f59285e;
    public String f59286f;
    public String h;
    public String f59287n;
    public String f59288r;
    public String f59289s;
    public int f59290w;
    public ArrayList f59291x;
    public z8.f f59292y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59282a);
        xb.l(parcel, 3, this.f59283b);
        xb.l(parcel, 4, this.f59284c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59285e);
        xb.l(parcel, 7, this.f59286f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59287n);
        xb.l(parcel, 10, this.f59288r);
        xb.l(parcel, 11, this.f59289s);
        int i10 = this.f59290w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        xb.p(parcel, 13, this.f59291x);
        xb.k(parcel, 14, this.f59292y, i7);
        xb.p(parcel, 15, this.D);
        xb.l(parcel, 16, this.E);
        xb.l(parcel, 17, this.F);
        xb.p(parcel, 18, this.G);
        boolean z9 = this.H;
        xb.q(parcel, 19, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.p(parcel, 20, this.I);
        xb.p(parcel, 21, this.J);
        xb.p(parcel, 22, this.K);
        xb.k(parcel, 23, this.L, i7);
        xb.s(parcel, r10);
    }
}
