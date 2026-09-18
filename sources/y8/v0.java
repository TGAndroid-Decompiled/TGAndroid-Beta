package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46683a;
    public final byte f46684b;
    public final String f46685c;

    public v0(byte b10, byte b11, String str) {
        this.f46683a = b10;
        this.f46684b = b11;
        this.f46685c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46683a == v0Var.f46683a && this.f46684b == v0Var.f46684b && this.f46685c.equals(v0Var.f46685c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46685c.hashCode() + ((((this.f46683a + 31) * 31) + this.f46684b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.k("AmsEntityUpdateParcelable{, mEntityId=", this.f46683a, ", mAttributeId=", this.f46684b, ", mValue='"), this.f46685c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46683a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46684b);
        w7.f0.l(parcel, 4, this.f46685c);
        w7.f0.r(parcel, q6);
    }
}
