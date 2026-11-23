package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f55608a;
    public final byte[] f55609b;
    public final int f55610c;

    public a(int i7, String str, byte[] bArr) {
        this.f55608a = str;
        this.f55609b = bArr;
        this.f55610c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f55608a);
        cc.c(parcel, 3, this.f55609b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f55610c);
        cc.s(parcel, r10);
    }
}
