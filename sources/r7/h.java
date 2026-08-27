package r7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new r6.l(8);

    public final boolean f46864a;

    public final boolean f46865b;

    public final boolean f46866c;
    public final boolean d;

    public final boolean f46867e;

    public final boolean f46868f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f46864a = z10;
        this.f46865b = z11;
        this.f46866c = z12;
        this.d = z13;
        this.f46867e = z14;
        this.f46868f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f46864a ? 1 : 0);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f46865b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f46866c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f46867e ? 1 : 0);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f46868f ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
