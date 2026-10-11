package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f51896a;
    public final String f51897b;
    public final String f51898c;

    public f(String str, String str2, String str3) {
        n6.m.h(str);
        this.f51896a = str;
        n6.m.h(str2);
        this.f51897b = str2;
        n6.m.h(str3);
        this.f51898c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f51896a.equals(fVar.f51896a) && n6.m.l(fVar.f51897b, this.f51897b) && n6.m.l(fVar.f51898c, this.f51898c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51896a.hashCode();
    }

    public final String toString() {
        String str = this.f51896a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.t(a1.g.x("Channel{token=", trim, ", nodeId=", this.f51897b, ", path="), this.f51898c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f51896a);
        w7.d0.l(parcel, 3, this.f51897b);
        w7.d0.l(parcel, 4, this.f51898c);
        w7.d0.r(parcel, q6);
    }
}
