package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class l0 extends c6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(12);
    public final int f42929a;
    public final short f42930b;
    public final short f42931c;

    public l0(int i10, short s6, short s9) {
        this.f42929a = i10;
        this.f42930b = s6;
        this.f42931c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f42929a != l0Var.f42929a || this.f42930b != l0Var.f42930b || this.f42931c != l0Var.f42931c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42929a), Short.valueOf(this.f42930b), Short.valueOf(this.f42931c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42929a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f42930b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f42931c);
        f5.r(parcel, q10);
    }
}
