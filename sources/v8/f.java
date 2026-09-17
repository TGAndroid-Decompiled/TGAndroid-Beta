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
    public String f47701a;
    public String f47702b;
    public String f47703c;
    public String d;
    public String f47704e;
    public String f47705f;
    public String h;
    public String f47706n;
    public String f47707r;
    public String f47708s;
    public int v;
    public ArrayList f47709w;
    public w8.f f47710x;
    public ArrayList f47711y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f47701a);
        e0.l(parcel, 3, this.f47702b);
        e0.l(parcel, 4, this.f47703c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f47704e);
        e0.l(parcel, 7, this.f47705f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.f47706n);
        e0.l(parcel, 10, this.f47707r);
        e0.l(parcel, 11, this.f47708s);
        int i11 = this.v;
        e0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        e0.p(parcel, 13, this.f47709w);
        e0.k(parcel, 14, this.f47710x, i10);
        e0.p(parcel, 15, this.f47711y);
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
