package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.n(26);
    public boolean f50719a;
    public boolean f50720b;
    public c f50721c;
    public boolean d;
    public m e;
    public ArrayList f50722f;
    public l h;
    public n f50723n;
    public boolean f50724r;
    public String f50725s;
    public Bundle f50726w;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        boolean z10 = this.f50719a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f50720b;
        h0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.k(parcel, 3, this.f50721c, i10);
        boolean z12 = this.d;
        h0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        h0.k(parcel, 5, this.e, i10);
        h0.h(parcel, 6, this.f50722f);
        h0.k(parcel, 7, this.h, i10);
        h0.k(parcel, 8, this.f50723n, i10);
        boolean z13 = this.f50724r;
        h0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        h0.l(parcel, 10, this.f50725s);
        h0.b(parcel, 11, this.f50726w);
        h0.r(parcel, q6);
    }
}
