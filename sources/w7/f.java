package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new j(28);
    public final long f48775a;
    public final a[] f48776b;
    public final int f48777c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i9, boolean z10) {
        this.f48775a = j10;
        this.f48776b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f48777c = i9;
        } else {
            this.f48777c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f48775a);
        p8.o(parcel, 3, this.f48776b, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f48777c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
