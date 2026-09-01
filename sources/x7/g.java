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
    public LatLng f50451a;
    public String f50452b;
    public String f50453c;
    public ai d;
    public float f50454e;
    public float f50455f;
    public boolean h;
    public boolean f50456n;
    public boolean f50457r;
    public float f50458s;
    public float v;
    public float f50459w;
    public float f50460x;
    public float f50461y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f50451a, i10);
        g5.l(parcel, 3, this.f50452b);
        g5.l(parcel, 4, this.f50453c);
        ai aiVar = this.d;
        if (aiVar == null) {
            asBinder = null;
        } else {
            asBinder = ((l6.a) aiVar.f25265b).asBinder();
        }
        g5.f(parcel, 5, asBinder);
        float f10 = this.f50454e;
        g5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f50455f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f50456n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f50457r;
        g5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f50458s;
        g5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f50459w;
        g5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f50460x;
        g5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f50461y;
        g5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        g5.r(parcel, q10);
    }
}
