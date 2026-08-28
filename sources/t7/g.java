package t7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g7.p8;
import m5.c0;
import q7.j;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new j(14);
    public LatLng f47721a;
    public String f47722b;
    public String f47723c;
    public c0 d;
    public float f47724e;
    public float f47725f;
    public boolean h;
    public boolean f47726n;
    public boolean f47727r;
    public float f47728s;
    public float v;
    public float f47729w;
    public float f47730x;
    public float f47731y;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        IBinder asBinder;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f47721a, i9);
        p8.l(parcel, 3, this.f47722b);
        p8.l(parcel, 4, this.f47723c);
        c0 c0Var = this.d;
        if (c0Var == null) {
            asBinder = null;
        } else {
            asBinder = ((h6.a) c0Var.f17378b).asBinder();
        }
        p8.f(parcel, 5, asBinder);
        float f10 = this.f47724e;
        p8.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f47725f;
        p8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f47726n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f47727r;
        p8.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f47728s;
        p8.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f47729w;
        p8.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f47730x;
        p8.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f47731y;
        p8.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        p8.r(parcel, q10);
    }
}
