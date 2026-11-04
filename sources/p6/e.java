package p6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new n8.g(16);
    public final int f53239a;
    public final String f53240b;

    public e(int i3, String str) {
        this.f53239a = i3;
        this.f53240b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f53239a == this.f53239a && m.k(eVar.f53240b, this.f53240b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f53239a;
    }

    public final String toString() {
        int i3 = this.f53239a;
        int length = String.valueOf(i3).length();
        String str = this.f53240b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i3);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53239a);
        j8.a.m(parcel, 2, this.f53240b);
        j8.a.t(parcel, s6);
    }
}
