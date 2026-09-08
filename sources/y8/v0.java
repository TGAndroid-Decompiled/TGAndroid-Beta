package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f49688a;
    public final byte f49689b;
    public final String f49690c;

    public v0(byte b10, byte b11, String str) {
        this.f49688a = b10;
        this.f49689b = b11;
        this.f49690c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f49688a == v0Var.f49688a && this.f49689b == v0Var.f49689b && this.f49690c.equals(v0Var.f49690c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49690c.hashCode() + ((((this.f49688a + 31) * 31) + this.f49689b) * 31);
    }

    public final String toString() {
        return a4.a.s(e2.k("AmsEntityUpdateParcelable{, mEntityId=", this.f49688a, ", mAttributeId=", this.f49689b, ", mValue='"), this.f49690c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49688a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49689b);
        w7.e0.l(parcel, 4, this.f49690c);
        w7.e0.r(parcel, q6);
    }
}
