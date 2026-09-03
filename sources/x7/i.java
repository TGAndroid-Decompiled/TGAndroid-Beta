package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import u6.p;
public class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new p(19);
    public final int f46922a;
    public final Float f46923b;

    public i(int i10, Float f10) {
        boolean z4 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z4 = false;
        }
        m.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z4);
        this.f46922a = i10;
        this.f46923b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f46922a == iVar.f46922a && m.l(this.f46923b, iVar.f46923b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46922a), this.f46923b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f46922a + " length=" + this.f46923b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f46922a);
        f5.e(parcel, 3, this.f46923b);
        f5.r(parcel, q10);
    }
}
