package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f55485a;
    public final byte[] f55486b;
    public final int f55487c;

    public a(int i7, String str, byte[] bArr) {
        this.f55485a = str;
        this.f55486b = bArr;
        this.f55487c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f55485a);
        bc.c(parcel, 3, this.f55486b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f55487c);
        bc.s(parcel, r10);
    }
}
