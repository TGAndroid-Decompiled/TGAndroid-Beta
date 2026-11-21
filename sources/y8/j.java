package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
    public boolean f61119a;
    public boolean f61120b;
    public c f61121c;
    public boolean d;
    public m f61122e;
    public ArrayList f61123f;
    public l h;
    public n f61124n;
    public boolean f61125r;
    public String f61126s;
    public Bundle f61127w;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        boolean z10 = this.f61119a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f61120b;
        bc.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.k(parcel, 3, this.f61121c, i7);
        boolean z12 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        bc.k(parcel, 5, this.f61122e, i7);
        bc.h(parcel, 6, this.f61123f);
        bc.k(parcel, 7, this.h, i7);
        bc.k(parcel, 8, this.f61124n, i7);
        boolean z13 = this.f61125r;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        bc.l(parcel, 10, this.f61126s);
        bc.b(parcel, 11, this.f61127w);
        bc.s(parcel, r10);
    }
}
