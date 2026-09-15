package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46428a;
    public final byte f46429b;
    public final String f46430c;

    public v0(byte b10, byte b11, String str) {
        this.f46428a = b10;
        this.f46429b = b11;
        this.f46430c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46428a == v0Var.f46428a && this.f46429b == v0Var.f46429b && this.f46430c.equals(v0Var.f46430c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46430c.hashCode() + ((((this.f46428a + 31) * 31) + this.f46429b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.m("AmsEntityUpdateParcelable{, mEntityId=", this.f46428a, ", mAttributeId=", this.f46429b, ", mValue='"), this.f46430c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46428a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46429b);
        w7.e0.l(parcel, 4, this.f46430c);
        w7.e0.r(parcel, q6);
    }
}
