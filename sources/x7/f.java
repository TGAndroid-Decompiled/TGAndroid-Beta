package x7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new w7.f(6);

    public final long f49375a;

    public final a[] f49376b;

    public final int f49377c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f49375a = j10;
        this.f49376b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f49377c = i10;
        } else {
            this.f49377c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f49375a);
        r8.o(parcel, 3, this.f49376b, i10);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f49377c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
