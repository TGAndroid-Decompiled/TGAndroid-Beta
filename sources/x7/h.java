package x7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import u6.p;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(18);
    public LatLng f46912a;
    public String f46913b;
    public String f46914c;
    public a d;
    public float e;
    public float f46915f;
    public boolean h;
    public boolean f46916n;
    public boolean f46917r;
    public float f46918s;
    public float v;
    public float f46919w;
    public float f46920x;
    public float f46921y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46912a, i10);
        f5.l(parcel, 3, this.f46913b);
        f5.l(parcel, 4, this.f46914c);
        a aVar = this.d;
        if (aVar == null) {
            asBinder = null;
        } else {
            asBinder = ((l6.a) aVar.f46898a).asBinder();
        }
        f5.f(parcel, 5, asBinder);
        float f10 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f46915f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f46916n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f46917r;
        f5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f46918s;
        f5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f46919w;
        f5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f46920x;
        f5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f46921y;
        f5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        f5.r(parcel, q10);
    }
}
