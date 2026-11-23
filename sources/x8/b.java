package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import u8.o;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int f60546a;
    public int f60547b;
    public int f60548c;
    public boolean d;
    public boolean f60549e;
    public float f60550f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f60546a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f60547b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f60548c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f60549e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f60550f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        cc.s(parcel, r10);
    }
}
