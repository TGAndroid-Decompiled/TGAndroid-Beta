package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f51773a;
    public final String f51774b;
    public final String f51775c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f51773a = str;
        n6.l.h(str2);
        this.f51774b = str2;
        n6.l.h(str3);
        this.f51775c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f51773a.equals(fVar.f51773a) && n6.l.l(fVar.f51774b, this.f51774b) && n6.l.l(fVar.f51775c, this.f51775c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51773a.hashCode();
    }

    public final String toString() {
        String str = this.f51773a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.t(a1.g.x("Channel{token=", trim, ", nodeId=", this.f51774b, ", path="), this.f51775c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f51773a);
        w7.d0.l(parcel, 3, this.f51774b);
        w7.d0.l(parcel, 4, this.f51775c);
        w7.d0.r(parcel, q6);
    }
}
