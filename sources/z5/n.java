package z5;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new w5.k(19);
    public final int f50657a;
    public final boolean f50658b;
    public final boolean f50659c;
    public final int d;
    public final int f50660e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f50657a = i10;
        this.f50658b = z10;
        this.f50659c = z11;
        this.d = i11;
        this.f50660e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50657a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f50658b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f50659c ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f50660e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
