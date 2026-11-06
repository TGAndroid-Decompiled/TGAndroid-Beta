package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f53835a;
    public final String f53836b;
    public final long f53837c;
    public final int d;
    public final boolean f53838e;

    public r(int i7, int i10, long j3, String str, boolean z9) {
        this.f53835a = i7;
        this.f53836b = str;
        this.f53837c = j3;
        this.d = i10;
        this.f53838e = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53835a);
        wb.l(parcel, 2, this.f53836b);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.f53837c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f53838e ? 1 : 0);
        wb.s(parcel, r10);
    }
}
