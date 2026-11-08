package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f58656a;
    public int f58657b;
    public int f58658c;
    public boolean d;
    public boolean f58659e;
    public float f58660f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f58656a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58657b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58658c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f58659e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f58660f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        xb.s(parcel, r10);
    }
}
