package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f43258a;
    public boolean f43259b;
    public c f43260c;
    public boolean d;
    public m e;
    public ArrayList f43261f;
    public l h;
    public n f43262n;
    public boolean f43263r;
    public String f43264s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        boolean z10 = this.f43258a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f43259b;
        e0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        e0.k(parcel, 3, this.f43260c, i10);
        boolean z12 = this.d;
        e0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        e0.k(parcel, 5, this.e, i10);
        e0.h(parcel, 6, this.f43261f);
        e0.k(parcel, 7, this.h, i10);
        e0.k(parcel, 8, this.f43262n, i10);
        boolean z13 = this.f43263r;
        e0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        e0.l(parcel, 10, this.f43264s);
        e0.b(parcel, 11, this.v);
        e0.r(parcel, q6);
    }
}
