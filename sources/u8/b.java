package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new n(23);
    public int f50199a;
    public int f50200b;
    public int f50201c;
    public boolean d;
    public boolean e;
    public float f50202f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f50199a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f50200b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f50201c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f50202f;
        h0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        h0.r(parcel, q6);
    }
}
