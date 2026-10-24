package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.k3;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f50507a;
    public final byte f50508b;
    public final String f50509c;

    public v0(byte b10, byte b11, String str) {
        this.f50507a = b10;
        this.f50508b = b11;
        this.f50509c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f50507a == v0Var.f50507a && this.f50508b == v0Var.f50508b && this.f50509c.equals(v0Var.f50509c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50509c.hashCode() + ((((this.f50507a + 31) * 31) + this.f50508b) * 31);
    }

    public final String toString() {
        return a1.g.s(k3.k("AmsEntityUpdateParcelable{, mEntityId=", this.f50507a, ", mAttributeId=", this.f50508b, ", mValue='"), this.f50509c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50507a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50508b);
        w7.f0.l(parcel, 4, this.f50509c);
        w7.f0.r(parcel, q6);
    }
}
