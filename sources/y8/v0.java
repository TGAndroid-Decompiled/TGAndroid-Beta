package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50058a;
    public final byte f50059b;
    public final String f50060c;

    public v0(byte b10, byte b11, String str) {
        this.f50058a = b10;
        this.f50059b = b11;
        this.f50060c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50058a == v0Var.f50058a && this.f50059b == v0Var.f50059b && this.f50060c.equals(v0Var.f50060c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50060c.hashCode() + ((((this.f50058a + 31) * 31) + this.f50059b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.d.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50058a, ", mAttributeId=", this.f50059b, ", mValue='"), this.f50060c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50058a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50059b);
        w7.f0.l(parcel, 4, this.f50060c);
        w7.f0.r(parcel, q6);
    }
}
