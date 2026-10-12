package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f52069a;
    public final byte f52070b;
    public final String f52071c;

    public v0(byte b10, byte b11, String str) {
        this.f52069a = b10;
        this.f52070b = b11;
        this.f52071c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f52069a == v0Var.f52069a && this.f52070b == v0Var.f52070b && this.f52071c.equals(v0Var.f52071c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52071c.hashCode() + ((((this.f52069a + 31) * 31) + this.f52070b) * 31);
    }

    public final String toString() {
        return a1.g.t(hg.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f52069a, ", mAttributeId=", this.f52070b, ", mValue='"), this.f52071c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52069a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52070b);
        w7.c0.l(parcel, 4, this.f52071c);
        w7.c0.r(parcel, q6);
    }
}
