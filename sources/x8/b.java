package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f58561a;
    public int f58562b;
    public int f58563c;
    public boolean d;
    public boolean f58564e;
    public float f58565f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f58561a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58562b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58563c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f58564e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f58565f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        xb.s(parcel, r10);
    }
}
