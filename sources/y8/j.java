package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f59293a;
    public boolean f59294b;
    public c f59295c;
    public boolean d;
    public m f59296e;
    public ArrayList f59297f;
    public l h;
    public n f59298n;
    public boolean f59299r;
    public String f59300s;
    public Bundle f59301w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        boolean z9 = this.f59293a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f59294b;
        xb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        xb.k(parcel, 3, this.f59295c, i7);
        boolean z11 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        xb.k(parcel, 5, this.f59296e, i7);
        xb.h(parcel, 6, this.f59297f);
        xb.k(parcel, 7, this.h, i7);
        xb.k(parcel, 8, this.f59298n, i7);
        boolean z12 = this.f59299r;
        xb.q(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        xb.l(parcel, 10, this.f59300s);
        xb.b(parcel, 11, this.f59301w);
        xb.s(parcel, r10);
    }
}
