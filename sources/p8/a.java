package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f53374a;
    public final byte[] f53375b;
    public final int f53376c;

    public a(int i7, String str, byte[] bArr) {
        this.f53374a = str;
        this.f53375b = bArr;
        this.f53376c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f53374a);
        wb.c(parcel, 3, this.f53375b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f53376c);
        wb.s(parcel, r10);
    }
}
