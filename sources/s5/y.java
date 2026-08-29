package s5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.w0;
public final class y extends a6.a {
    public static final Parcelable.Creator<y> CREATOR = new w0(20);
    public final int f47640a;
    public final boolean f47641b;
    public final boolean f47642c;

    public y(int i10, boolean z10, boolean z11) {
        this.f47640a = i10;
        this.f47641b = z10;
        this.f47642c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f47640a == yVar.f47640a && this.f47641b == yVar.f47641b && this.f47642c == yVar.f47642c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47640a), Boolean.valueOf(this.f47641b), Boolean.valueOf(this.f47642c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f47640a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f47641b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f47642c ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
