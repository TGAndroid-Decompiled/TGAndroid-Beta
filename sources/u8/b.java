package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new m(24);
    public int f46227a;
    public int f46228b;
    public int f46229c;
    public boolean d;
    public boolean e;
    public float f46230f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f46227a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f46228b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f46229c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f46230f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        g0.r(parcel, q6);
    }
}
