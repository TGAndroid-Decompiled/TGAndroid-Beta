package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.g5;
import java.util.ArrayList;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(14);
    public LatLng f50438a;
    public double f50439b;
    public float f50440c;
    public int d;
    public int f50441e;
    public float f50442f;
    public boolean h;
    public boolean f50443n;
    public ArrayList f50444r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f50438a, i10);
        double d = this.f50439b;
        g5.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f50440c;
        g5.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f50441e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f50442f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f50443n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.p(parcel, 10, this.f50444r);
        g5.r(parcel, q10);
    }
}
