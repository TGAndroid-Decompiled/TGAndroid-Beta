package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f51827a;
    public final int f51828b;
    public final int f51829c;

    public a1(String str, int i10, int i11) {
        this.f51827a = str;
        this.f51828b = i10;
        this.f51829c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f51828b == a1Var.f51828b && this.f51829c == a1Var.f51829c && ((str2 = this.f51827a) == (str = a1Var.f51827a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51827a, Integer.valueOf(this.f51828b), Integer.valueOf(this.f51829c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.t(hg.c.k("WebIconParcelable{", this.f51828b, "x", this.f51829c, " - "), this.f51827a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51827a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51828b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51829c);
        w7.d0.r(parcel, q6);
    }
}
