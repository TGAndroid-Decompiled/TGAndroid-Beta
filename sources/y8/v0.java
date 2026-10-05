package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50556a;
    public final byte f50557b;
    public final String f50558c;

    public v0(byte b10, byte b11, String str) {
        this.f50556a = b10;
        this.f50557b = b11;
        this.f50558c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50556a == v0Var.f50556a && this.f50557b == v0Var.f50557b && this.f50558c.equals(v0Var.f50558c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50558c.hashCode() + ((((this.f50556a + 31) * 31) + this.f50557b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f50556a, ", mAttributeId=", this.f50557b, ", mValue='"), this.f50558c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50556a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50557b);
        w7.g0.l(parcel, 4, this.f50558c);
        w7.g0.r(parcel, q6);
    }
}
