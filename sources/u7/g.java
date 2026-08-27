package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h7.r8;
import n2.b0;
import r6.l;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new l(23);

    public LatLng f48443a;

    public String f48444b;

    public String f48445c;
    public b0 d;

    public float f48446e;

    public float f48447f;
    public boolean h;

    public boolean f48448n;

    public boolean f48449r;

    public float f48450s;
    public float v;

    public float f48451w;

    public float f48452x;

    public float f48453y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f48443a, i10);
        r8.l(parcel, 3, this.f48444b);
        r8.l(parcel, 4, this.f48445c);
        b0 b0Var = this.d;
        r8.f(parcel, 5, b0Var == null ? null : ((i6.a) b0Var.f18130b).asBinder());
        float f10 = this.f48446e;
        r8.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f48447f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48448n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f48449r;
        r8.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.f48450s;
        r8.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.f48451w;
        r8.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.f48452x;
        r8.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.f48453y;
        r8.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        r8.r(parcel, iQ);
    }
}
