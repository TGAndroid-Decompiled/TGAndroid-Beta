package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String f59229a;
    public final String f59230b;
    public final int f59231c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.f59229a = str;
        this.f59230b = str2;
        this.f59231c = i7;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59229a);
        wb.l(parcel, 3, this.f59230b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f59231c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        wb.s(parcel, r10);
    }
}
