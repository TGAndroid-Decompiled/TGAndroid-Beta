package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46578a;
    public final byte f46579b;
    public final String f46580c;

    public v0(byte b10, byte b11, String str) {
        this.f46578a = b10;
        this.f46579b = b11;
        this.f46580c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46578a == v0Var.f46578a && this.f46579b == v0Var.f46579b && this.f46580c.equals(v0Var.f46580c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46580c.hashCode() + ((((this.f46578a + 31) * 31) + this.f46579b) * 31);
    }

    public final String toString() {
        return a4.a.s(hc.b.n("AmsEntityUpdateParcelable{, mEntityId=", this.f46578a, ", mAttributeId=", this.f46579b, ", mValue='"), this.f46580c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46578a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46579b);
        w7.e0.l(parcel, 4, this.f46580c);
        w7.e0.r(parcel, q6);
    }
}
