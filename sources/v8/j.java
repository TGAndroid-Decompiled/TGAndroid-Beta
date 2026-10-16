package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.m(27);
    public boolean f46895a;
    public boolean f46896b;
    public c f46897c;
    public boolean d;
    public m e;
    public ArrayList f46898f;
    public l h;
    public n f46899n;
    public boolean f46900r;
    public String f46901s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        boolean z10 = this.f46895a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f46896b;
        f0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        f0.k(parcel, 3, this.f46897c, i10);
        boolean z12 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        f0.k(parcel, 5, this.e, i10);
        f0.h(parcel, 6, this.f46898f);
        f0.k(parcel, 7, this.h, i10);
        f0.k(parcel, 8, this.f46899n, i10);
        boolean z13 = this.f46900r;
        f0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        f0.l(parcel, 10, this.f46901s);
        f0.b(parcel, 11, this.v);
        f0.r(parcel, q6);
    }
}
