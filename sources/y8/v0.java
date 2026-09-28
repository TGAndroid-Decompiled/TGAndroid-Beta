package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46708a;
    public final byte f46709b;
    public final String f46710c;

    public v0(byte b10, byte b11, String str) {
        this.f46708a = b10;
        this.f46709b = b11;
        this.f46710c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46708a == v0Var.f46708a && this.f46709b == v0Var.f46709b && this.f46710c.equals(v0Var.f46710c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46710c.hashCode() + ((((this.f46708a + 31) * 31) + this.f46709b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f46708a, ", mAttributeId=", this.f46709b, ", mValue='"), this.f46710c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46708a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46709b);
        w7.f0.l(parcel, 4, this.f46710c);
        w7.f0.r(parcel, q6);
    }
}
