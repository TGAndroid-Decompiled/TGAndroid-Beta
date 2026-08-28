package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g7.p8;
import java.util.ArrayList;
import q7.j;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(10);
    public LatLng f47708a;
    public double f47709b;
    public float f47710c;
    public int d;
    public int f47711e;
    public float f47712f;
    public boolean h;
    public boolean f47713n;
    public ArrayList f47714r;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f47708a, i9);
        double d = this.f47709b;
        p8.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.f47710c;
        p8.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i10 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i10);
        int i11 = this.f47711e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        float f11 = this.f47712f;
        p8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f47713n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.p(parcel, 10, this.f47714r);
        p8.r(parcel, q10);
    }
}
