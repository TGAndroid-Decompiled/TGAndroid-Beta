package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import java.util.ArrayList;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(14);
    public LatLng f46832a;
    public double f46833b;
    public float f46834c;
    public int d;
    public int e;
    public float f46835f;
    public boolean h;
    public boolean f46836n;
    public ArrayList f46837r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46832a, i10);
        double d = this.f46833b;
        f5.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f46834c;
        f5.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f46835f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f46836n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.p(parcel, 10, this.f46837r);
        f5.r(parcel, q10);
    }
}
