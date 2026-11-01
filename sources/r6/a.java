package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new n(3);
    public final boolean f46342a;
    public final int f46343b;

    public a(int i10, boolean z10) {
        this.f46342a = z10;
        this.f46343b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f46342a ? 1 : 0);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f46343b);
        h0.r(parcel, q6);
    }
}
