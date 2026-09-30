package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46709a;
    public final byte f46710b;
    public final String f46711c;

    public v0(byte b10, byte b11, String str) {
        this.f46709a = b10;
        this.f46710b = b11;
        this.f46711c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46709a == v0Var.f46709a && this.f46710b == v0Var.f46710b && this.f46711c.equals(v0Var.f46711c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46711c.hashCode() + ((((this.f46709a + 31) * 31) + this.f46710b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f46709a, ", mAttributeId=", this.f46710b, ", mValue='"), this.f46711c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46709a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46710b);
        w7.f0.l(parcel, 4, this.f46711c);
        w7.f0.r(parcel, q6);
    }
}
