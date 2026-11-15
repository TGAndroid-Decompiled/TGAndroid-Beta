package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f59847a;
    public int f59848b;
    public int f59849c;
    public boolean d;
    public boolean f59850e;
    public float f59851f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f59847a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f59848b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f59849c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f59850e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f59851f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        yb.s(parcel, r10);
    }
}
