package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46706a;
    public final byte f46707b;
    public final String f46708c;

    public v0(byte b10, byte b11, String str) {
        this.f46706a = b10;
        this.f46707b = b11;
        this.f46708c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46706a == v0Var.f46706a && this.f46707b == v0Var.f46707b && this.f46708c.equals(v0Var.f46708c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46708c.hashCode() + ((((this.f46706a + 31) * 31) + this.f46707b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f46706a, ", mAttributeId=", this.f46707b, ", mValue='"), this.f46708c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46706a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46707b);
        w7.f0.l(parcel, 4, this.f46708c);
        w7.f0.r(parcel, q6);
    }
}
