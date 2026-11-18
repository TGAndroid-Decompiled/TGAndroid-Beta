package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f61077a;
    public boolean f61078b;
    public c f61079c;
    public boolean d;
    public m f61080e;
    public ArrayList f61081f;
    public l h;
    public n f61082n;
    public boolean f61083r;
    public String f61084s;
    public Bundle f61085w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        boolean z10 = this.f61077a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f61078b;
        bc.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.k(parcel, 3, this.f61079c, i7);
        boolean z12 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        bc.k(parcel, 5, this.f61080e, i7);
        bc.h(parcel, 6, this.f61081f);
        bc.k(parcel, 7, this.h, i7);
        bc.k(parcel, 8, this.f61082n, i7);
        boolean z13 = this.f61083r;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        bc.l(parcel, 10, this.f61084s);
        bc.b(parcel, 11, this.f61085w);
        bc.s(parcel, r10);
    }
}
