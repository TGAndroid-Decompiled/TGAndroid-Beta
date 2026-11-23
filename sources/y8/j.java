package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f61088a;
    public boolean f61089b;
    public c f61090c;
    public boolean d;
    public m f61091e;
    public ArrayList f61092f;
    public l h;
    public n f61093n;
    public boolean f61094r;
    public String f61095s;
    public Bundle f61096w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        boolean z10 = this.f61088a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f61089b;
        cc.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.k(parcel, 3, this.f61090c, i7);
        boolean z12 = this.d;
        cc.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        cc.k(parcel, 5, this.f61091e, i7);
        cc.h(parcel, 6, this.f61092f);
        cc.k(parcel, 7, this.h, i7);
        cc.k(parcel, 8, this.f61093n, i7);
        boolean z13 = this.f61094r;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        cc.l(parcel, 10, this.f61095s);
        cc.b(parcel, 11, this.f61096w);
        cc.s(parcel, r10);
    }
}
