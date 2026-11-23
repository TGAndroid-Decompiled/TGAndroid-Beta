package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new q4.x(1);
    public final int f56008a;
    public final String f56009b;

    public e(int i7, String str) {
        this.f56008a = i7;
        this.f56009b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f56008a == this.f56008a && m.l(eVar.f56009b, this.f56009b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f56008a;
    }

    public final String toString() {
        int i7 = this.f56008a;
        int length = String.valueOf(i7).length();
        String str = this.f56009b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56008a);
        cc.l(parcel, 2, this.f56009b);
        cc.s(parcel, r10);
    }
}
