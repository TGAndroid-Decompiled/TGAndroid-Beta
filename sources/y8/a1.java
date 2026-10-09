package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f51740a;
    public final int f51741b;
    public final int f51742c;

    public a1(String str, int i10, int i11) {
        this.f51740a = str;
        this.f51741b = i10;
        this.f51742c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f51741b == a1Var.f51741b && this.f51742c == a1Var.f51742c && ((str2 = this.f51740a) == (str = a1Var.f51740a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51740a, Integer.valueOf(this.f51741b), Integer.valueOf(this.f51742c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.t(hg.c.k("WebIconParcelable{", this.f51741b, "x", this.f51742c, " - "), this.f51740a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51740a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51741b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51742c);
        w7.d0.r(parcel, q6);
    }
}
