package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new w8.b(18);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public y8.c M;
    public String f58529a;
    public String f58530b;
    public String f58531c;
    public String d;
    public String f58532e;
    public String f58533f;
    public String h;
    public String f58534n;
    public String f58535r;
    public String f58536s;
    public int f58537w;
    public ArrayList f58538x;
    public y8.f f58539y;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f58529a);
        j8.a.m(parcel, 3, this.f58530b);
        j8.a.m(parcel, 4, this.f58531c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f58532e);
        j8.a.m(parcel, 7, this.f58533f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.f58534n);
        j8.a.m(parcel, 10, this.f58535r);
        j8.a.m(parcel, 11, this.f58536s);
        int i10 = this.f58537w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(i10);
        j8.a.q(parcel, 13, this.f58538x);
        j8.a.l(parcel, 14, this.f58539y, i3);
        j8.a.q(parcel, 15, this.E);
        j8.a.m(parcel, 16, this.F);
        j8.a.m(parcel, 17, this.G);
        j8.a.q(parcel, 18, this.H);
        boolean z10 = this.I;
        j8.a.r(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.q(parcel, 20, this.J);
        j8.a.q(parcel, 21, this.K);
        j8.a.q(parcel, 22, this.L);
        j8.a.l(parcel, 23, this.M, i3);
        j8.a.t(parcel, s6);
    }
}
