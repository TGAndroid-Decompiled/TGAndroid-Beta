package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(5);
    public final byte[] f47106a;

    public d(byte[] bArr) {
        this.f47106a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.f47106a);
        g5.r(parcel, q10);
    }
}
