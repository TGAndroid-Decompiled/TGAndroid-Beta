package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50105a;
    public final byte f50106b;
    public final String f50107c;

    public v0(byte b10, byte b11, String str) {
        this.f50105a = b10;
        this.f50106b = b11;
        this.f50107c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50105a == v0Var.f50105a && this.f50106b == v0Var.f50106b && this.f50107c.equals(v0Var.f50107c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50107c.hashCode() + ((((this.f50105a + 31) * 31) + this.f50106b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.d.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50105a, ", mAttributeId=", this.f50106b, ", mValue='"), this.f50107c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50105a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50106b);
        w7.f0.l(parcel, 4, this.f50107c);
        w7.f0.r(parcel, q6);
    }
}
