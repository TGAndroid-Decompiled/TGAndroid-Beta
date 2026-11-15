package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f60512a;
    public boolean f60513b;
    public c f60514c;
    public boolean d;
    public m f60515e;
    public ArrayList f60516f;
    public l h;
    public n f60517n;
    public boolean f60518r;
    public String f60519s;
    public Bundle f60520w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        boolean z10 = this.f60512a;
        yb.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f60513b;
        yb.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        yb.k(parcel, 3, this.f60514c, i7);
        boolean z12 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        yb.k(parcel, 5, this.f60515e, i7);
        yb.h(parcel, 6, this.f60516f);
        yb.k(parcel, 7, this.h, i7);
        yb.k(parcel, 8, this.f60517n, i7);
        boolean z13 = this.f60518r;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        yb.l(parcel, 10, this.f60519s);
        yb.b(parcel, 11, this.f60520w);
        yb.s(parcel, r10);
    }
}
