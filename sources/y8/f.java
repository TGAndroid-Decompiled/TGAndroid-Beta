package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f50007a;
    public final String f50008b;
    public final String f50009c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f50007a = str;
        n6.l.h(str2);
        this.f50008b = str2;
        n6.l.h(str3);
        this.f50009c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f50007a.equals(fVar.f50007a) && n6.l.l(fVar.f50008b, this.f50008b) && n6.l.l(fVar.f50009c, this.f50009c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50007a.hashCode();
    }

    public final String toString() {
        String str = this.f50007a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.s(a1.g.w("Channel{token=", trim, ", nodeId=", this.f50008b, ", path="), this.f50009c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f50007a);
        w7.f0.l(parcel, 3, this.f50008b);
        w7.f0.l(parcel, 4, this.f50009c);
        w7.f0.r(parcel, q6);
    }
}
