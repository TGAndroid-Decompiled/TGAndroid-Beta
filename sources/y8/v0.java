package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50067a;
    public final byte f50068b;
    public final String f50069c;

    public v0(byte b10, byte b11, String str) {
        this.f50067a = b10;
        this.f50068b = b11;
        this.f50069c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50067a == v0Var.f50067a && this.f50068b == v0Var.f50068b && this.f50069c.equals(v0Var.f50069c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50069c.hashCode() + ((((this.f50067a + 31) * 31) + this.f50068b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.e.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50067a, ", mAttributeId=", this.f50068b, ", mValue='"), this.f50069c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50067a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50068b);
        w7.f0.l(parcel, 4, this.f50069c);
        w7.f0.r(parcel, q6);
    }
}
