package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46691a;
    public final String f46692b;
    public final String f46693c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46691a = str;
        n6.l.h(str2);
        this.f46692b = str2;
        n6.l.h(str3);
        this.f46693c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46691a.equals(fVar.f46691a) && n6.l.l(fVar.f46692b, this.f46692b) && n6.l.l(fVar.f46693c, this.f46693c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46691a.hashCode();
    }

    public final String toString() {
        String str = this.f46691a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.s(a4.a.w("Channel{token=", trim, ", nodeId=", this.f46692b, ", path="), this.f46693c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46691a);
        w7.f0.l(parcel, 3, this.f46692b);
        w7.f0.l(parcel, 4, this.f46693c);
        w7.f0.r(parcel, q6);
    }
}
