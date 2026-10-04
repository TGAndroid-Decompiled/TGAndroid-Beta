package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f48210a;
    public boolean f48211b;
    public c f48212c;
    public boolean d;
    public m f48213e;
    public ArrayList f48214f;
    public l h;
    public n f48215n;
    public boolean f48216r;
    public String f48217s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        boolean z10 = this.f48210a;
        g0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48211b;
        g0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g0.k(parcel, 3, this.f48212c, i10);
        boolean z12 = this.d;
        g0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        g0.k(parcel, 5, this.f48213e, i10);
        g0.h(parcel, 6, this.f48214f);
        g0.k(parcel, 7, this.h, i10);
        g0.k(parcel, 8, this.f48215n, i10);
        boolean z13 = this.f48216r;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        g0.l(parcel, 10, this.f48217s);
        g0.b(parcel, 11, this.v);
        g0.r(parcel, q6);
    }
}
