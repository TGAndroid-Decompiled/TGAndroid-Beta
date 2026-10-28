package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class g extends p6.a implements y8.b, y8.d {
    public static final Parcelable.Creator<g> CREATOR = new d(2);
    public final String f52791a;
    public final String f52792b;
    public final String f52793c;

    public g(String str, String str2, String str3) {
        o6.l.h(str);
        this.f52791a = str;
        o6.l.h(str2);
        this.f52792b = str2;
        o6.l.h(str3);
        this.f52793c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f52791a.equals(gVar.f52791a) && o6.l.l(gVar.f52792b, this.f52792b) && o6.l.l(gVar.f52793c, this.f52793c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52791a.hashCode();
    }

    public final String toString() {
        String str = this.f52791a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.s(a1.g.w("Channel{token=", trim, ", nodeId=", this.f52792b, ", path="), this.f52793c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52791a);
        df.l(parcel, 3, this.f52792b);
        df.l(parcel, 4, this.f52793c);
        df.r(parcel, q5);
    }
}
