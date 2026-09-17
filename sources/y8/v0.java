package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f49689a;
    public final byte f49690b;
    public final String f49691c;

    public v0(byte b10, byte b11, String str) {
        this.f49689a = b10;
        this.f49690b = b11;
        this.f49691c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f49689a == v0Var.f49689a && this.f49690b == v0Var.f49690b && this.f49691c.equals(v0Var.f49691c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49691c.hashCode() + ((((this.f49689a + 31) * 31) + this.f49690b) * 31);
    }

    public final String toString() {
        return a4.a.s(e2.k("AmsEntityUpdateParcelable{, mEntityId=", this.f49689a, ", mAttributeId=", this.f49690b, ", mValue='"), this.f49691c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49689a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49690b);
        w7.e0.l(parcel, 4, this.f49691c);
        w7.e0.r(parcel, q6);
    }
}
