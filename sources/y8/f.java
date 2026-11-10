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
    public String f59280a;
    public String f59281b;
    public String f59282c;
    public String d;
    public String f59283e;
    public String f59284f;
    public String h;
    public String f59285n;
    public String f59286r;
    public String f59287s;
    public int f59288w;
    public ArrayList f59289x;
    public z8.f f59290y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59280a);
        xb.l(parcel, 3, this.f59281b);
        xb.l(parcel, 4, this.f59282c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59283e);
        xb.l(parcel, 7, this.f59284f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59285n);
        xb.l(parcel, 10, this.f59286r);
        xb.l(parcel, 11, this.f59287s);
        int i10 = this.f59288w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        xb.p(parcel, 13, this.f59289x);
        xb.k(parcel, 14, this.f59290y, i7);
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
