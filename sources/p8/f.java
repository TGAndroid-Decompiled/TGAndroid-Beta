package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long f53383a;
    public final a[] f53384b;
    public final int f53385c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z9) {
        this.f53383a = j3;
        this.f53384b = aVarArr;
        this.d = z9;
        if (z9) {
            this.f53385c = i7;
        } else {
            this.f53385c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.f53383a);
        wb.o(parcel, 3, this.f53384b, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.f53385c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }
}
