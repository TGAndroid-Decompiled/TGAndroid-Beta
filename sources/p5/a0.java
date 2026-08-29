package p5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class a0 extends a6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w0(7);
    public final boolean f45610a;

    public a0(boolean z10) {
        this.f45610a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f45610a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
