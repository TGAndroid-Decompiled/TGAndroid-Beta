package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import java.util.ArrayList;
import u6.p;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(14);
    public LatLng f46900a;
    public double f46901b;
    public float f46902c;
    public int d;
    public int e;
    public float f46903f;
    public boolean h;
    public boolean f46904n;
    public ArrayList f46905r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46900a, i10);
        double d = this.f46901b;
        f5.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f46902c;
        f5.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f46903f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f46904n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.p(parcel, 10, this.f46905r);
        f5.r(parcel, q10);
    }
}
