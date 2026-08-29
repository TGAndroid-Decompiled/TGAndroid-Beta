package z5;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w5.k(22);
    public final n f50593a;
    public final boolean f50594b;
    public final boolean f50595c;
    public final int[] d;
    public final int f50596e;
    public final int[] f50597f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f50593a = nVar;
        this.f50594b = z10;
        this.f50595c = z11;
        this.d = iArr;
        this.f50596e = i10;
        this.f50597f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f50593a, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f50594b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f50595c ? 1 : 0);
        com.google.android.gms.internal.cast.o.g(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f50596e);
        com.google.android.gms.internal.cast.o.g(parcel, 6, this.f50597f);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
