package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new k(10);
    public final long f50505a;
    public final a[] f50506b;
    public final int f50507c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f50505a = j10;
        this.f50506b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f50507c = i10;
        } else {
            this.f50507c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 2, 8);
        parcel.writeLong(this.f50505a);
        o.o(parcel, 3, this.f50506b, i10);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.f50507c);
        o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        o.r(parcel, q6);
    }
}
