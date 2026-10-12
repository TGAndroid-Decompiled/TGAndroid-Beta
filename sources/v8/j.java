package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.c0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
    public boolean f49705a;
    public boolean f49706b;
    public c f49707c;
    public boolean d;
    public m f49708e;
    public ArrayList f49709f;
    public l h;
    public n f49710n;
    public boolean f49711r;
    public String f49712s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        boolean z10 = this.f49705a;
        c0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49706b;
        c0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c0.k(parcel, 3, this.f49707c, i10);
        boolean z12 = this.d;
        c0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        c0.k(parcel, 5, this.f49708e, i10);
        c0.h(parcel, 6, this.f49709f);
        c0.k(parcel, 7, this.h, i10);
        c0.k(parcel, 8, this.f49710n, i10);
        boolean z13 = this.f49711r;
        c0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        c0.l(parcel, 10, this.f49712s);
        c0.b(parcel, 11, this.v);
        c0.r(parcel, q6);
    }
}
