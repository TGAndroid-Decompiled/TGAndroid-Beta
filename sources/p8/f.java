package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f53409a;
    public final a[] f53410b;
    public final int f53411c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z9) {
        this.f53409a = j3;
        this.f53410b = aVarArr;
        this.d = z9;
        if (z9) {
            this.f53411c = i7;
        } else {
            this.f53411c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.f53409a);
        wb.o(parcel, 3, this.f53410b, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f53411c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }
}
