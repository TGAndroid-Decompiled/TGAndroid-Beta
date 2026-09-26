package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46646a;
    public final String f46647b;
    public final String f46648c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46646a = str;
        n6.l.h(str2);
        this.f46647b = str2;
        n6.l.h(str3);
        this.f46648c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46646a.equals(fVar.f46646a) && n6.l.l(fVar.f46647b, this.f46647b) && n6.l.l(fVar.f46648c, this.f46648c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46646a.hashCode();
    }

    public final String toString() {
        String str = this.f46646a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.t(a4.a.x("Channel{token=", trim, ", nodeId=", this.f46647b, ", path="), this.f46648c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46646a);
        w7.f0.l(parcel, 3, this.f46647b);
        w7.f0.l(parcel, 4, this.f46648c);
        w7.f0.r(parcel, q6);
    }
}
