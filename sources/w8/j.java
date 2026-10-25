package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new q7.m(27);
    public boolean f51103a;
    public boolean f51104b;
    public c f51105c;
    public boolean d;
    public m e;
    public ArrayList f51106f;
    public l h;
    public n f51107n;
    public boolean f51108r;
    public String f51109s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        boolean z10 = this.f51103a;
        df.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f51104b;
        df.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.k(parcel, 3, this.f51105c, i10);
        boolean z12 = this.d;
        df.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        df.k(parcel, 5, this.e, i10);
        df.h(parcel, 6, this.f51106f);
        df.k(parcel, 7, this.h, i10);
        df.k(parcel, 8, this.f51107n, i10);
        boolean z13 = this.f51108r;
        df.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        df.l(parcel, 10, this.f51109s);
        df.b(parcel, 11, this.v);
        df.r(parcel, q5);
    }
}
