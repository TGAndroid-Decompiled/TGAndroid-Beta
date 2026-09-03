package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(7);
    public final byte[] f47108a;

    public f(byte[] bArr) {
        this.f47108a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 1, this.f47108a);
        g5.r(parcel, q10);
    }
}
