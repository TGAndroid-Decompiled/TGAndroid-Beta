package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50068a;
    public final byte f50069b;
    public final String f50070c;

    public v0(byte b10, byte b11, String str) {
        this.f50068a = b10;
        this.f50069b = b11;
        this.f50070c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50068a == v0Var.f50068a && this.f50069b == v0Var.f50069b && this.f50070c.equals(v0Var.f50070c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50070c.hashCode() + ((((this.f50068a + 31) * 31) + this.f50069b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.e.m("AmsEntityUpdateParcelable{, mEntityId=", this.f50068a, ", mAttributeId=", this.f50069b, ", mValue='"), this.f50070c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50068a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50069b);
        w7.f0.l(parcel, 4, this.f50070c);
        w7.f0.r(parcel, q6);
    }
}
