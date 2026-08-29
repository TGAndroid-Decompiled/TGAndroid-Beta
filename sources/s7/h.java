package s7;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new s6.i(12);
    public final boolean f47676a;
    public final boolean f47677b;
    public final boolean f47678c;
    public final boolean d;
    public final boolean f47679e;
    public final boolean f47680f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f47676a = z10;
        this.f47677b = z11;
        this.f47678c = z12;
        this.d = z13;
        this.f47679e = z14;
        this.f47680f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f47676a ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f47677b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f47678c ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f47679e ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.f47680f ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
