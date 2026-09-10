package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46518a;
    public final String f46519b;
    public final String f46520c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46518a = str;
        n6.l.h(str2);
        this.f46519b = str2;
        n6.l.h(str3);
        this.f46520c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46518a.equals(fVar.f46518a) && n6.l.l(fVar.f46519b, this.f46519b) && n6.l.l(fVar.f46520c, this.f46520c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46518a.hashCode();
    }

    public final String toString() {
        String str = this.f46518a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.s(a4.a.w("Channel{token=", trim, ", nodeId=", this.f46519b, ", path="), this.f46520c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46518a);
        w7.e0.l(parcel, 3, this.f46519b);
        w7.e0.l(parcel, 4, this.f46520c);
        w7.e0.r(parcel, q6);
    }
}
