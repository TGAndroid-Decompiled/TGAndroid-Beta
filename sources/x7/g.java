package x7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import ph.j5;
import u6.p;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(18);
    public LatLng f46844a;
    public String f46845b;
    public String f46846c;
    public j5 d;
    public float e;
    public float f46847f;
    public boolean h;
    public boolean f46848n;
    public boolean f46849r;
    public float f46850s;
    public float v;
    public float f46851w;
    public float f46852x;
    public float f46853y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46844a, i10);
        f5.l(parcel, 3, this.f46845b);
        f5.l(parcel, 4, this.f46846c);
        j5 j5Var = this.d;
        if (j5Var == null) {
            asBinder = null;
        } else {
            asBinder = ((l6.a) j5Var.f41782b).asBinder();
        }
        f5.f(parcel, 5, asBinder);
        float f10 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f46847f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f46848n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f46849r;
        f5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f46850s;
        f5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f46851w;
        f5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f46852x;
        f5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f46853y;
        f5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        f5.r(parcel, q10);
    }
}
