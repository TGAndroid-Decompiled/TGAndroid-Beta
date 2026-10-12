package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int f49111a;
    public int f49112b;
    public int f49113c;
    public boolean d;
    public boolean f49114e;
    public float f49115f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f49111a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f49112b;
        c0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f49113c;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        c0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f49114e;
        c0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f49115f;
        c0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        c0.r(parcel, q6);
    }
}
