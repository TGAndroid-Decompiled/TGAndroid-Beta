package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f53491a;
    public final byte[] f53492b;
    public final int f53493c;

    public a(int i7, String str, byte[] bArr) {
        this.f53491a = str;
        this.f53492b = bArr;
        this.f53493c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53491a);
        xb.c(parcel, 3, this.f53492b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f53493c);
        xb.s(parcel, r10);
    }
}
