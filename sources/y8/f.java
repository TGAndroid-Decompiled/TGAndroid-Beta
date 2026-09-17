package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46391a;
    public final String f46392b;
    public final String f46393c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46391a = str;
        n6.l.h(str2);
        this.f46392b = str2;
        n6.l.h(str3);
        this.f46393c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46391a.equals(fVar.f46391a) && n6.l.l(fVar.f46392b, this.f46392b) && n6.l.l(fVar.f46393c, this.f46393c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46391a.hashCode();
    }

    public final String toString() {
        String str = this.f46391a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.s(a4.a.w("Channel{token=", trim, ", nodeId=", this.f46392b, ", path="), this.f46393c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46391a);
        w7.e0.l(parcel, 3, this.f46392b);
        w7.e0.l(parcel, 4, this.f46393c);
        w7.e0.r(parcel, q6);
    }
}
