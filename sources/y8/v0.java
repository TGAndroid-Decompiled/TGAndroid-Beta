package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f51924a;
    public final byte f51925b;
    public final String f51926c;

    public v0(byte b10, byte b11, String str) {
        this.f51924a = b10;
        this.f51925b = b11;
        this.f51926c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f51924a == v0Var.f51924a && this.f51925b == v0Var.f51925b && this.f51926c.equals(v0Var.f51926c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51926c.hashCode() + ((((this.f51924a + 31) * 31) + this.f51925b) * 31);
    }

    public final String toString() {
        return a1.g.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f51924a, ", mAttributeId=", this.f51925b, ", mValue='"), this.f51926c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51924a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51925b);
        w7.d0.l(parcel, 4, this.f51926c);
        w7.d0.r(parcel, q6);
    }
}
