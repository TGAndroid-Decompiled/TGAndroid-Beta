package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46424a;
    public final byte f46425b;
    public final String f46426c;

    public v0(byte b10, byte b11, String str) {
        this.f46424a = b10;
        this.f46425b = b11;
        this.f46426c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46424a == v0Var.f46424a && this.f46425b == v0Var.f46425b && this.f46426c.equals(v0Var.f46426c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46426c.hashCode() + ((((this.f46424a + 31) * 31) + this.f46425b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f46424a, ", mAttributeId=", this.f46425b, ", mValue='"), this.f46426c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46424a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46425b);
        w7.e0.l(parcel, 4, this.f46426c);
        w7.e0.r(parcel, q6);
    }
}
