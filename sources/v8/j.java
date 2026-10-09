package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f49469a;
    public boolean f49470b;
    public c f49471c;
    public boolean d;
    public m f49472e;
    public ArrayList f49473f;
    public l h;
    public n f49474n;
    public boolean f49475r;
    public String f49476s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        boolean z10 = this.f49469a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49470b;
        d0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.k(parcel, 3, this.f49471c, i10);
        boolean z12 = this.d;
        d0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        d0.k(parcel, 5, this.f49472e, i10);
        d0.h(parcel, 6, this.f49473f);
        d0.k(parcel, 7, this.h, i10);
        d0.k(parcel, 8, this.f49474n, i10);
        boolean z13 = this.f49475r;
        d0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        d0.l(parcel, 10, this.f49476s);
        d0.b(parcel, 11, this.v);
        d0.r(parcel, q6);
    }
}
