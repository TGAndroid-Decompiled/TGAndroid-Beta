package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import r5.c0;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new c0(12);
    public final int f48445a;
    public final boolean f48446b;
    public final boolean f48447c;

    public y(int i10, boolean z4, boolean z10) {
        this.f48445a = i10;
        this.f48446b = z4;
        this.f48447c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f48445a == yVar.f48445a && this.f48446b == yVar.f48446b && this.f48447c == yVar.f48447c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48445a), Boolean.valueOf(this.f48446b), Boolean.valueOf(this.f48447c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f48445a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f48446b ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f48447c ? 1 : 0);
        g5.r(parcel, q10);
    }
}
