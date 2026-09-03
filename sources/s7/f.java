package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(7);
    public final byte[] f44168a;

    public f(byte[] bArr) {
        this.f44168a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 1, this.f44168a);
        f5.r(parcel, q10);
    }
}
