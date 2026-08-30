package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(6);
    public final byte[] f44102a;

    public e(byte[] bArr) {
        this.f44102a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.f44102a);
        f5.r(parcel, q10);
    }
}
