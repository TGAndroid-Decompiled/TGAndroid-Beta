package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f48202a;
    public boolean f48203b;
    public c f48204c;
    public boolean d;
    public m f48205e;
    public ArrayList f48206f;
    public l h;
    public n f48207n;
    public boolean f48208r;
    public String f48209s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        boolean z10 = this.f48202a;
        g0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48203b;
        g0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g0.k(parcel, 3, this.f48204c, i10);
        boolean z12 = this.d;
        g0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        g0.k(parcel, 5, this.f48205e, i10);
        g0.h(parcel, 6, this.f48206f);
        g0.k(parcel, 7, this.h, i10);
        g0.k(parcel, 8, this.f48207n, i10);
        boolean z13 = this.f48208r;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        g0.l(parcel, 10, this.f48209s);
        g0.b(parcel, 11, this.v);
        g0.r(parcel, q6);
    }
}
