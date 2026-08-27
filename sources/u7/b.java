package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h7.r8;
import java.util.ArrayList;
import r6.l;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new l(19);

    public LatLng f48430a;

    public double f48431b;

    public float f48432c;
    public int d;

    public int f48433e;

    public float f48434f;
    public boolean h;

    public boolean f48435n;

    public ArrayList f48436r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f48430a, i10);
        double d = this.f48431b;
        r8.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f48432c;
        r8.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.f48433e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f48434f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f48435n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.p(parcel, 10, this.f48436r);
        r8.r(parcel, iQ);
    }
}
