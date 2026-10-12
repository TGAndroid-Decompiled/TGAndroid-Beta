package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new m(6);
    public final int f43936a;
    public final boolean f43937b;

    public c(int i10, boolean z10) {
        this.f43936a = i10;
        this.f43937b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f43936a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f43937b ? 1 : 0);
        g0.r(parcel, q6);
    }
}
