package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f46662a;
    public final String f46663b;
    public final int f46664c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.f46662a = str;
        this.f46663b = str2;
        this.f46664c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f46662a.equals(this.f46662a);
    }

    public final int hashCode() {
        return this.f46662a.hashCode();
    }

    public final String toString() {
        StringBuilder x10 = a4.a.x("Node{", this.f46663b, ", id=", this.f46662a, ", hops=");
        x10.append(this.f46664c);
        x10.append(", isNearby=");
        x10.append(this.d);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46662a);
        w7.f0.l(parcel, 3, this.f46663b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f46664c);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
