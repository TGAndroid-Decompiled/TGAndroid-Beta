package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String f53400a;
    public final byte[] f53401b;
    public final int f53402c;

    public a(int i7, String str, byte[] bArr) {
        this.f53400a = str;
        this.f53401b = bArr;
        this.f53402c = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f53400a);
        wb.c(parcel, 3, this.f53401b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f53402c);
        wb.s(parcel, r10);
    }
}
