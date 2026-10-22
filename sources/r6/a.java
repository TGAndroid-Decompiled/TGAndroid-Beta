package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(4);
    public final boolean f45033a;
    public final int f45034b;

    public a(int i10, boolean z10) {
        this.f45033a = z10;
        this.f45034b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45033a ? 1 : 0);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45034b);
        f0.r(parcel, q6);
    }
}
