package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f53802a;
    public final boolean f53803b;
    public final boolean f53804c;
    public final int d;
    public final int f53805e;

    public o(int i7, int i10, int i11, boolean z9, boolean z10) {
        this.f53802a = i7;
        this.f53803b = z9;
        this.f53804c = z10;
        this.d = i10;
        this.f53805e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53802a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f53803b ? 1 : 0);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53804c ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f53805e);
        wb.s(parcel, r10);
    }
}
