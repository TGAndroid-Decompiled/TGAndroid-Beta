package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f48675a;
    public final byte f48676b;
    public final String f48677c;

    public v0(byte b10, byte b11, String str) {
        this.f48675a = b10;
        this.f48676b = b11;
        this.f48677c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f48675a == v0Var.f48675a && this.f48676b == v0Var.f48676b && this.f48677c.equals(v0Var.f48677c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48677c.hashCode() + ((((this.f48675a + 31) * 31) + this.f48676b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.d.m("AmsEntityUpdateParcelable{, mEntityId=", this.f48675a, ", mAttributeId=", this.f48676b, ", mValue='"), this.f48677c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48675a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48676b);
        w7.f0.l(parcel, 4, this.f48677c);
        w7.f0.r(parcel, q6);
    }
}
