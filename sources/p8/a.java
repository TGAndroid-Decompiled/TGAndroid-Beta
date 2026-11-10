package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f53503a;
    public final byte[] f53504b;
    public final int f53505c;

    public a(int i7, String str, byte[] bArr) {
        this.f53503a = str;
        this.f53504b = bArr;
        this.f53505c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f53503a);
        xb.c(parcel, 3, this.f53504b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f53505c);
        xb.s(parcel, r10);
    }
}
