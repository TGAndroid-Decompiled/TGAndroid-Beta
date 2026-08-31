package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.g5;
import java.util.ArrayList;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(14);
    public LatLng f50437a;
    public double f50438b;
    public float f50439c;
    public int d;
    public int f50440e;
    public float f50441f;
    public boolean h;
    public boolean f50442n;
    public ArrayList f50443r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f50437a, i10);
        double d = this.f50438b;
        g5.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f50439c;
        g5.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f50440e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f50441f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f50442n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.p(parcel, 10, this.f50443r);
        g5.r(parcel, q10);
    }
}
