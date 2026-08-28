package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new w7.i(7);
    public final int f48957a;
    public final boolean f48958b;
    public final boolean f48959c;
    public final int d;
    public final int f48960e;

    public n(int i9, int i10, int i11, boolean z10, boolean z11) {
        this.f48957a = i9;
        this.f48958b = z10;
        this.f48959c = z11;
        this.d = i10;
        this.f48960e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48957a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48958b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48959c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f48960e);
        p8.r(parcel, q10);
    }
}
