package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f60417a;
    public int f60418b;
    public int f60419c;
    public boolean d;
    public boolean f60420e;
    public float f60421f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f60417a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f60418b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f60419c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f60420e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f60421f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        bc.s(parcel, r10);
    }
}
