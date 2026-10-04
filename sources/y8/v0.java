package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50549a;
    public final byte f50550b;
    public final String f50551c;

    public v0(byte b10, byte b11, String str) {
        this.f50549a = b10;
        this.f50550b = b11;
        this.f50551c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50549a == v0Var.f50549a && this.f50550b == v0Var.f50550b && this.f50551c.equals(v0Var.f50551c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50551c.hashCode() + ((((this.f50549a + 31) * 31) + this.f50550b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f50549a, ", mAttributeId=", this.f50550b, ", mValue='"), this.f50551c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50549a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50550b);
        w7.g0.l(parcel, 4, this.f50551c);
        w7.g0.r(parcel, q6);
    }
}
