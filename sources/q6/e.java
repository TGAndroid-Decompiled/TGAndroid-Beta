package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new q4.x(1);
    public final int f55926a;
    public final String f55927b;

    public e(int i7, String str) {
        this.f55926a = i7;
        this.f55927b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f55926a == this.f55926a && m.l(eVar.f55927b, this.f55927b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f55926a;
    }

    public final String toString() {
        int i7 = this.f55926a;
        int length = String.valueOf(i7).length();
        String str = this.f55927b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f55926a);
        bc.l(parcel, 2, this.f55927b);
        bc.s(parcel, r10);
    }
}
