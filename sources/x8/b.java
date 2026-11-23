package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f60463a;
    public int f60464b;
    public int f60465c;
    public boolean d;
    public boolean f60466e;
    public float f60467f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f60463a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f60464b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f60465c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f60466e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f60467f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        bc.s(parcel, r10);
    }
}
