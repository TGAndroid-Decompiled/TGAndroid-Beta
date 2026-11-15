package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f54909a;
    public final byte[] f54910b;
    public final int f54911c;

    public a(int i7, String str, byte[] bArr) {
        this.f54909a = str;
        this.f54910b = bArr;
        this.f54911c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f54909a);
        yb.c(parcel, 3, this.f54910b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f54911c);
        yb.s(parcel, r10);
    }
}
