package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46364a;
    public final String f46365b;
    public final String f46366c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46364a = str;
        n6.l.h(str2);
        this.f46365b = str2;
        n6.l.h(str3);
        this.f46366c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46364a.equals(fVar.f46364a) && n6.l.l(fVar.f46365b, this.f46365b) && n6.l.l(fVar.f46366c, this.f46366c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46364a.hashCode();
    }

    public final String toString() {
        String str = this.f46364a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.t(a4.a.x("Channel{token=", trim, ", nodeId=", this.f46365b, ", path="), this.f46366c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46364a);
        w7.e0.l(parcel, 3, this.f46365b);
        w7.e0.l(parcel, 4, this.f46366c);
        w7.e0.r(parcel, q6);
    }
}
