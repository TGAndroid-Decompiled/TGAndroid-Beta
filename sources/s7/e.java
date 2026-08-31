package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(6);
    public final byte[] f47076a;

    public e(byte[] bArr) {
        this.f47076a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.f47076a);
        g5.r(parcel, q10);
    }
}
