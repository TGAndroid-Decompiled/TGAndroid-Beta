package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f44628a;
    public boolean f44629b;
    public c f44630c;
    public boolean d;
    public m e;
    public ArrayList f44631f;
    public l h;
    public n f44632n;
    public boolean f44633r;
    public String f44634s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        boolean z10 = this.f44628a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f44629b;
        f0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.k(parcel, 3, this.f44630c, i10);
        boolean z12 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f0.k(parcel, 5, this.e, i10);
        f0.h(parcel, 6, this.f44631f);
        f0.k(parcel, 7, this.h, i10);
        f0.k(parcel, 8, this.f44632n, i10);
        boolean z13 = this.f44633r;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        f0.l(parcel, 10, this.f44634s);
        f0.b(parcel, 11, this.v);
        f0.r(parcel, q6);
    }
}
