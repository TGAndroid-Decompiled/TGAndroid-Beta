package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends o6.a implements x8.b, x8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f46368a;
    public final String f46369b;
    public final String f46370c;

    public f(String str, String str2, String str3) {
        n6.l.h(str);
        this.f46368a = str;
        n6.l.h(str2);
        this.f46369b = str2;
        n6.l.h(str3);
        this.f46370c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f46368a.equals(fVar.f46368a) && n6.l.l(fVar.f46369b, this.f46369b) && n6.l.l(fVar.f46370c, this.f46370c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46368a.hashCode();
    }

    public final String toString() {
        String str = this.f46368a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a4.a.s(a4.a.w("Channel{token=", trim, ", nodeId=", this.f46369b, ", path="), this.f46370c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46368a);
        w7.e0.l(parcel, 3, this.f46369b);
        w7.e0.l(parcel, 4, this.f46370c);
        w7.e0.r(parcel, q6);
    }
}
