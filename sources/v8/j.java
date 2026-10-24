package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.m(27);
    public boolean f48728a;
    public boolean f48729b;
    public c f48730c;
    public boolean d;
    public m e;
    public ArrayList f48731f;
    public l h;
    public n f48732n;
    public boolean f48733r;
    public String f48734s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        boolean z10 = this.f48728a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48729b;
        f0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.k(parcel, 3, this.f48730c, i10);
        boolean z12 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f0.k(parcel, 5, this.e, i10);
        f0.h(parcel, 6, this.f48731f);
        f0.k(parcel, 7, this.h, i10);
        f0.k(parcel, 8, this.f48732n, i10);
        boolean z13 = this.f48733r;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        f0.l(parcel, 10, this.f48734s);
        f0.b(parcel, 11, this.v);
        f0.r(parcel, q6);
    }
}
