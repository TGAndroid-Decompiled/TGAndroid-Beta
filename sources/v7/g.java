package v7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.maps.model.LatLng;
import org.telegram.ui.Components.n;
import s6.i;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(27);
    public LatLng f49451a;
    public String f49452b;
    public String f49453c;
    public n d;
    public float f49454e;
    public float f49455f;
    public boolean h;
    public boolean f49456n;
    public boolean f49457r;
    public float f49458s;
    public float v;
    public float f49459w;
    public float f49460x;
    public float f49461y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.f49451a, i10);
        o.l(parcel, 3, this.f49452b);
        o.l(parcel, 4, this.f49453c);
        n nVar = this.d;
        if (nVar == null) {
            asBinder = null;
        } else {
            asBinder = ((j6.a) nVar.f30787b).asBinder();
        }
        o.f(parcel, 5, asBinder);
        float f9 = this.f49454e;
        o.s(parcel, 6, 4);
        parcel.writeFloat(f9);
        float f10 = this.f49455f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        o.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49456n;
        o.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f49457r;
        o.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.f49458s;
        o.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        o.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.f49459w;
        o.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f49460x;
        o.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f49461y;
        o.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        o.r(parcel, q6);
    }
}
