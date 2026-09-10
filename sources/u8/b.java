package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int f42614a;
    public int f42615b;
    public int f42616c;
    public boolean d;
    public boolean e;
    public float f42617f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f42614a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f42615b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f42616c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f42617f;
        e0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        e0.r(parcel, q6);
    }
}
