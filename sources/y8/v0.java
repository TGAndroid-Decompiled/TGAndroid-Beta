package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f51958a;
    public final byte f51959b;
    public final String f51960c;

    public v0(byte b10, byte b11, String str) {
        this.f51958a = b10;
        this.f51959b = b11;
        this.f51960c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f51958a == v0Var.f51958a && this.f51959b == v0Var.f51959b && this.f51960c.equals(v0Var.f51960c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51960c.hashCode() + ((((this.f51958a + 31) * 31) + this.f51959b) * 31);
    }

    public final String toString() {
        return a1.g.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f51958a, ", mAttributeId=", this.f51959b, ", mValue='"), this.f51960c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51958a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51959b);
        w7.d0.l(parcel, 4, this.f51960c);
        w7.d0.r(parcel, q6);
    }
}
