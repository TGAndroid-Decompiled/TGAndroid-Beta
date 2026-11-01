package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new n(5);
    public final int f46345a;
    public final boolean f46346b;

    public c(int i10, boolean z10) {
        this.f46345a = i10;
        this.f46346b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f46345a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f46346b ? 1 : 0);
        h0.r(parcel, q6);
    }
}
