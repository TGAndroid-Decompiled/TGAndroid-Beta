package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public z8.c M;
    public String f61102a;
    public String f61103b;
    public String f61104c;
    public String d;
    public String f61105e;
    public String f61106f;
    public String h;
    public String f61107n;
    public String f61108r;
    public String f61109s;
    public int f61110w;
    public ArrayList f61111x;
    public z8.f f61112y;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61102a);
        bc.l(parcel, 3, this.f61103b);
        bc.l(parcel, 4, this.f61104c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f61105e);
        bc.l(parcel, 7, this.f61106f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f61107n);
        bc.l(parcel, 10, this.f61108r);
        bc.l(parcel, 11, this.f61109s);
        int i10 = this.f61110w;
        bc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        bc.p(parcel, 13, this.f61111x);
        bc.k(parcel, 14, this.f61112y, i7);
        bc.p(parcel, 15, this.E);
        bc.l(parcel, 16, this.F);
        bc.l(parcel, 17, this.G);
        bc.p(parcel, 18, this.H);
        boolean z10 = this.I;
        bc.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.p(parcel, 20, this.J);
        bc.p(parcel, 21, this.K);
        bc.p(parcel, 22, this.L);
        bc.k(parcel, 23, this.M, i7);
        bc.s(parcel, r10);
    }
}
