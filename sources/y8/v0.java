package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50059a;
    public final byte f50060b;
    public final String f50061c;

    public v0(byte b10, byte b11, String str) {
        this.f50059a = b10;
        this.f50060b = b11;
        this.f50061c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50059a == v0Var.f50059a && this.f50060b == v0Var.f50060b && this.f50061c.equals(v0Var.f50061c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50061c.hashCode() + ((((this.f50059a + 31) * 31) + this.f50060b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.e.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50059a, ", mAttributeId=", this.f50060b, ", mValue='"), this.f50061c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50059a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50060b);
        w7.f0.l(parcel, 4, this.f50061c);
        w7.f0.r(parcel, q6);
    }
}
