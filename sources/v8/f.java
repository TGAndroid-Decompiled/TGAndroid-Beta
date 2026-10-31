package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(9);
    public ArrayList D;
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w8.c L;
    public String f50686a;
    public String f50687b;
    public String f50688c;
    public String d;
    public String e;
    public String f50689f;
    public String h;
    public String f50690n;
    public String f50691r;
    public String f50692s;
    public int f50693w;
    public ArrayList f50694x;
    public w8.f f50695y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50686a);
        h0.l(parcel, 3, this.f50687b);
        h0.l(parcel, 4, this.f50688c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f50689f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.f50690n);
        h0.l(parcel, 10, this.f50691r);
        h0.l(parcel, 11, this.f50692s);
        int i11 = this.f50693w;
        h0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        h0.p(parcel, 13, this.f50694x);
        h0.k(parcel, 14, this.f50695y, i10);
        h0.p(parcel, 15, this.D);
        h0.l(parcel, 16, this.E);
        h0.l(parcel, 17, this.F);
        h0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        h0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.p(parcel, 20, this.I);
        h0.p(parcel, 21, this.J);
        h0.p(parcel, 22, this.K);
        h0.k(parcel, 23, this.L, i10);
        h0.r(parcel, q6);
    }
}
