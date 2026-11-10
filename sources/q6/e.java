package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new q4.x(1);
    public final int f53874a;
    public final String f53875b;

    public e(int i7, String str) {
        this.f53874a = i7;
        this.f53875b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f53874a == this.f53874a && m.k(eVar.f53875b, this.f53875b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f53874a;
    }

    public final String toString() {
        int i7 = this.f53874a;
        int length = String.valueOf(i7).length();
        String str = this.f53875b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53874a);
        xb.l(parcel, 2, this.f53875b);
        xb.s(parcel, r10);
    }
}
