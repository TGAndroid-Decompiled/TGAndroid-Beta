package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f44521a;
    public boolean f44522b;
    public c f44523c;
    public boolean d;
    public m e;
    public ArrayList f44524f;
    public l h;
    public n f44525n;
    public boolean f44526r;
    public String f44527s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        boolean z10 = this.f44521a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f44522b;
        f0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.k(parcel, 3, this.f44523c, i10);
        boolean z12 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f0.k(parcel, 5, this.e, i10);
        f0.h(parcel, 6, this.f44524f);
        f0.k(parcel, 7, this.h, i10);
        f0.k(parcel, 8, this.f44525n, i10);
        boolean z13 = this.f44526r;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        f0.l(parcel, 10, this.f44527s);
        f0.b(parcel, 11, this.v);
        f0.r(parcel, q6);
    }
}
