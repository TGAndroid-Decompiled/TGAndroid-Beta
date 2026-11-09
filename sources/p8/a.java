package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f53504a;
    public final byte[] f53505b;
    public final int f53506c;

    public a(int i7, String str, byte[] bArr) {
        this.f53504a = str;
        this.f53505b = bArr;
        this.f53506c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53504a);
        xb.c(parcel, 3, this.f53505b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f53506c);
        xb.s(parcel, r10);
    }
}
