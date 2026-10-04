package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50540a;
    public final byte f50541b;
    public final String f50542c;

    public v0(byte b10, byte b11, String str) {
        this.f50540a = b10;
        this.f50541b = b11;
        this.f50542c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50540a == v0Var.f50540a && this.f50541b == v0Var.f50541b && this.f50542c.equals(v0Var.f50542c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50542c.hashCode() + ((((this.f50540a + 31) * 31) + this.f50541b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.k("AmsEntityUpdateParcelable{, mEntityId=", this.f50540a, ", mAttributeId=", this.f50541b, ", mValue='"), this.f50542c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50540a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50541b);
        w7.g0.l(parcel, 4, this.f50542c);
        w7.g0.r(parcel, q6);
    }
}
