package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(5);
    public final byte[] f44101a;

    public d(byte[] bArr) {
        this.f44101a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.f44101a);
        f5.r(parcel, q10);
    }
}
