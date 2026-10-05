package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int f47580a;
    public int f47581b;
    public int f47582c;
    public boolean d;
    public boolean f47583e;
    public float f47584f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f47580a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f47581b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f47582c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f47583e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f47584f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        g0.r(parcel, q6);
    }
}
