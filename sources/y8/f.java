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
    public String f59177a;
    public String f59178b;
    public String f59179c;
    public String d;
    public String f59180e;
    public String f59181f;
    public String h;
    public String f59182n;
    public String f59183r;
    public String f59184s;
    public int f59185w;
    public ArrayList f59186x;
    public z8.f f59187y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59177a);
        xb.l(parcel, 3, this.f59178b);
        xb.l(parcel, 4, this.f59179c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f59180e);
        xb.l(parcel, 7, this.f59181f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.f59182n);
        xb.l(parcel, 10, this.f59183r);
        xb.l(parcel, 11, this.f59184s);
        int i10 = this.f59185w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        xb.p(parcel, 13, this.f59186x);
        xb.k(parcel, 14, this.f59187y, i7);
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
