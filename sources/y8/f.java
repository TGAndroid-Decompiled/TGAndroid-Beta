package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f54244a;
    public final String f54245b;
    public final String f54246c;

    public f(String str, String str2, String str3) {
        n6.l.g(str);
        this.f54244a = str;
        n6.l.g(str2);
        this.f54245b = str2;
        n6.l.g(str3);
        this.f54246c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f54244a.equals(fVar.f54244a) && n6.l.k(fVar.f54245b, this.f54245b) && n6.l.k(fVar.f54246c, this.f54246c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f54244a.hashCode();
    }

    public final String toString() {
        String str = this.f54244a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.r(a1.g.v("Channel{token=", trim, ", nodeId=", this.f54245b, ", path="), this.f54246c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.f54244a);
        w7.h0.l(parcel, 3, this.f54245b);
        w7.h0.l(parcel, 4, this.f54246c);
        w7.h0.r(parcel, q6);
    }
}
