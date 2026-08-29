package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import s6.i;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(23);
    public LatLng f49438a;
    public double f49439b;
    public float f49440c;
    public int d;
    public int f49441e;
    public float f49442f;
    public boolean h;
    public boolean f49443n;
    public ArrayList f49444r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.f49438a, i10);
        double d = this.f49439b;
        o.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f9 = this.f49440c;
        o.s(parcel, 4, 4);
        parcel.writeFloat(f9);
        int i11 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f49441e;
        o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f49442f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        o.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49443n;
        o.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        o.p(parcel, 10, this.f49444r);
        o.r(parcel, q6);
    }
}
