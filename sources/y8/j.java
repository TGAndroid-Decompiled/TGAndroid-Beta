package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f46679a;
    public final boolean f46680b;
    public final boolean f46681c;
    public final boolean d;
    public final boolean e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f46679a = i10;
        this.f46680b = z10;
        this.f46681c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46679a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46680b ? 1 : 0);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46681c ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
