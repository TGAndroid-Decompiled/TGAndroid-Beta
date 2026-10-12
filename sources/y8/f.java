package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f48616a;
    public final String f48617b;
    public final String f48618c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f48616a = str;
        n6.l.h(str2);
        this.f48617b = str2;
        n6.l.h(str3);
        this.f48618c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f48616a.equals(fVar.f48616a) && n6.l.l(fVar.f48617b, this.f48617b) && n6.l.l(fVar.f48618c, this.f48618c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48616a.hashCode();
    }

    public final String toString() {
        String str = this.f48616a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.s(a1.g.w("Channel{token=", trim, ", nodeId=", this.f48617b, ", path="), this.f48618c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f48616a);
        w7.g0.l(parcel, 3, this.f48617b);
        w7.g0.l(parcel, 4, this.f48618c);
        w7.g0.r(parcel, q6);
    }
}
