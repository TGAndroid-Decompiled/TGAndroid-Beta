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
    public LatLng f50487a;
    public String f50488b;
    public String f50489c;
    public ai d;
    public float f50490e;
    public float f50491f;
    public boolean h;
    public boolean f50492n;
    public boolean f50493r;
    public float f50494s;
    public float v;
    public float f50495w;
    public float f50496x;
    public float f50497y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f50487a, i10);
        g5.l(parcel, 3, this.f50488b);
        g5.l(parcel, 4, this.f50489c);
        ai aiVar = this.d;
        if (aiVar == null) {
            asBinder = null;
        } else {
            asBinder = ((l6.a) aiVar.f25257b).asBinder();
        }
        g5.f(parcel, 5, asBinder);
        float f10 = this.f50490e;
        g5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f50491f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f50492n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f50493r;
        g5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.f50494s;
        g5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f50495w;
        g5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f50496x;
        g5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f50497y;
        g5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        g5.r(parcel, q10);
    }
}
