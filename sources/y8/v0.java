package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46752a;
    public final byte f46753b;
    public final String f46754c;

    public v0(byte b10, byte b11, String str) {
        this.f46752a = b10;
        this.f46753b = b11;
        this.f46754c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46752a == v0Var.f46752a && this.f46753b == v0Var.f46753b && this.f46754c.equals(v0Var.f46754c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46754c.hashCode() + ((((this.f46752a + 31) * 31) + this.f46753b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.l("AmsEntityUpdateParcelable{, mEntityId=", this.f46752a, ", mAttributeId=", this.f46753b, ", mValue='"), this.f46754c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46752a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46753b);
        w7.f0.l(parcel, 4, this.f46754c);
        w7.f0.r(parcel, q6);
    }
}
