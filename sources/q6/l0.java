package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class l0 extends c6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(12);
    public final int f42959a;
    public final short f42960b;
    public final short f42961c;

    public l0(int i10, short s6, short s9) {
        this.f42959a = i10;
        this.f42960b = s6;
        this.f42961c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f42959a != l0Var.f42959a || this.f42960b != l0Var.f42960b || this.f42961c != l0Var.f42961c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42959a), Short.valueOf(this.f42960b), Short.valueOf(this.f42961c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42959a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f42960b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f42961c);
        f5.r(parcel, q10);
    }
}
