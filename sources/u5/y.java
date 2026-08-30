package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import r5.c0;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new c0(12);
    public final int f45154a;
    public final boolean f45155b;
    public final boolean f45156c;

    public y(int i10, boolean z4, boolean z10) {
        this.f45154a = i10;
        this.f45155b = z4;
        this.f45156c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f45154a == yVar.f45154a && this.f45155b == yVar.f45155b && this.f45156c == yVar.f45156c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45154a), Boolean.valueOf(this.f45155b), Boolean.valueOf(this.f45156c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45154a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f45155b ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f45156c ? 1 : 0);
        f5.r(parcel, q10);
    }
}
