package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f55495a;
    public final byte[] f55496b;
    public final int f55497c;

    public a(int i7, String str, byte[] bArr) {
        this.f55495a = str;
        this.f55496b = bArr;
        this.f55497c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f55495a);
        cc.c(parcel, 3, this.f55496b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f55497c);
        cc.s(parcel, r10);
    }
}
