package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f50448a;
    public final String f50449b;
    public final String f50450c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f50448a = str;
        n6.l.h(str2);
        this.f50449b = str2;
        n6.l.h(str3);
        this.f50450c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f50448a.equals(fVar.f50448a) && n6.l.l(fVar.f50449b, this.f50449b) && n6.l.l(fVar.f50450c, this.f50450c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50448a.hashCode();
    }

    public final String toString() {
        String str = this.f50448a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.s(a1.g.w("Channel{token=", trim, ", nodeId=", this.f50449b, ", path="), this.f50450c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f50448a);
        w7.f0.l(parcel, 3, this.f50449b);
        w7.f0.l(parcel, 4, this.f50450c);
        w7.f0.r(parcel, q6);
    }
}
