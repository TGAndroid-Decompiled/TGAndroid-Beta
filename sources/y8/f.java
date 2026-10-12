package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f52007a;
    public final String f52008b;
    public final String f52009c;

    public f(String str, String str2, String str3) {
        n6.m.h(str);
        this.f52007a = str;
        n6.m.h(str2);
        this.f52008b = str2;
        n6.m.h(str3);
        this.f52009c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f52007a.equals(fVar.f52007a) && n6.m.l(fVar.f52008b, this.f52008b) && n6.m.l(fVar.f52009c, this.f52009c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52007a.hashCode();
    }

    public final String toString() {
        String str = this.f52007a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.t(a1.g.x("Channel{token=", trim, ", nodeId=", this.f52008b, ", path="), this.f52009c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f52007a);
        w7.c0.l(parcel, 3, this.f52008b);
        w7.c0.l(parcel, 4, this.f52009c);
        w7.c0.r(parcel, q6);
    }
}
