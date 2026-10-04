package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50541a;
    public final byte f50542b;
    public final String f50543c;

    public v0(byte b10, byte b11, String str) {
        this.f50541a = b10;
        this.f50542b = b11;
        this.f50543c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50541a == v0Var.f50541a && this.f50542b == v0Var.f50542b && this.f50543c.equals(v0Var.f50543c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50543c.hashCode() + ((((this.f50541a + 31) * 31) + this.f50542b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.k("AmsEntityUpdateParcelable{, mEntityId=", this.f50541a, ", mAttributeId=", this.f50542b, ", mValue='"), this.f50543c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50541a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50542b);
        w7.g0.l(parcel, 4, this.f50543c);
        w7.g0.r(parcel, q6);
    }
}
