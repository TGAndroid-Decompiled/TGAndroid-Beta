package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f59198a;
    public boolean f59199b;
    public c f59200c;
    public boolean d;
    public m f59201e;
    public ArrayList f59202f;
    public l h;
    public n f59203n;
    public boolean f59204r;
    public String f59205s;
    public Bundle f59206w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        boolean z9 = this.f59198a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f59199b;
        xb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        xb.k(parcel, 3, this.f59200c, i7);
        boolean z11 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        xb.k(parcel, 5, this.f59201e, i7);
        xb.h(parcel, 6, this.f59202f);
        xb.k(parcel, 7, this.h, i7);
        xb.k(parcel, 8, this.f59203n, i7);
        boolean z12 = this.f59204r;
        xb.q(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        xb.l(parcel, 10, this.f59205s);
        xb.b(parcel, 11, this.f59206w);
        xb.s(parcel, r10);
    }
}
