package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class w0 extends p6.a implements y8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f52793a;
    public final byte f52794b;
    public final String f52795c;

    public w0(byte b10, byte b11, String str) {
        this.f52793a = b10;
        this.f52794b = b11;
        this.f52795c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f52793a == w0Var.f52793a && this.f52794b == w0Var.f52794b && this.f52795c.equals(w0Var.f52795c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52795c.hashCode() + ((((this.f52793a + 31) * 31) + this.f52794b) * 31);
    }

    public final String toString() {
        return a1.g.s(c3.h0.n("AmsEntityUpdateParcelable{, mEntityId=", this.f52793a, ", mAttributeId=", this.f52794b, ", mValue='"), this.f52795c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52793a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52794b);
        df.l(parcel, 4, this.f52795c);
        df.r(parcel, q5);
    }
}
