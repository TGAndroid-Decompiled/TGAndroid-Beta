package x7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.g5;
import org.telegram.ui.Components.ai;
import u6.p;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(18);
    public LatLng f50450a;
    public String f50451b;
    public String f50452c;
    public ai d;
    public float f50453e;
    public float f50454f;
    public boolean h;
    public boolean f50455n;
    public boolean f50456r;
    public float f50457s;
    public float v;
    public float f50458w;
    public float f50459x;
    public float f50460y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f50450a, i10);
        g5.l(parcel, 3, this.f50451b);
        g5.l(parcel, 4, this.f50452c);
        ai aiVar = this.d;
        if (aiVar == null) {
            asBinder = null;
        } else {
            asBinder = ((l6.a) aiVar.f25265b).asBinder();
        }
        g5.f(parcel, 5, asBinder);
        float f10 = this.f50453e;
        g5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f50454f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f50455n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f50456r;
        g5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f50457s;
        g5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f50458w;
        g5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f50459x;
        g5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f50460y;
        g5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        g5.r(parcel, q10);
    }
}
