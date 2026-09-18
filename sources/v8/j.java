package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f44492a;
    public boolean f44493b;
    public c f44494c;
    public boolean d;
    public m e;
    public ArrayList f44495f;
    public l h;
    public n f44496n;
    public boolean f44497r;
    public String f44498s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        boolean z10 = this.f44492a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f44493b;
        f0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.k(parcel, 3, this.f44494c, i10);
        boolean z12 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f0.k(parcel, 5, this.e, i10);
        f0.h(parcel, 6, this.f44495f);
        f0.k(parcel, 7, this.h, i10);
        f0.k(parcel, 8, this.f44496n, i10);
        boolean z13 = this.f44497r;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        f0.l(parcel, 10, this.f44498s);
        f0.b(parcel, 11, this.v);
        f0.r(parcel, q6);
    }
}
