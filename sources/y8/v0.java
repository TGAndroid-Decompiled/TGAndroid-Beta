package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50080a;
    public final byte f50081b;
    public final String f50082c;

    public v0(byte b10, byte b11, String str) {
        this.f50080a = b10;
        this.f50081b = b11;
        this.f50082c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50080a == v0Var.f50080a && this.f50081b == v0Var.f50081b && this.f50082c.equals(v0Var.f50082c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50082c.hashCode() + ((((this.f50080a + 31) * 31) + this.f50081b) * 31);
    }

    public final String toString() {
        return a1.g.s(i0.a.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50080a, ", mAttributeId=", this.f50081b, ", mValue='"), this.f50082c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50080a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50081b);
        w7.f0.l(parcel, 4, this.f50082c);
        w7.f0.r(parcel, q6);
    }
}
