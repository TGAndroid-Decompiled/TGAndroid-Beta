package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46613a;
    public final int f46614b;
    public final int f46615c;

    public a1(String str, int i10, int i11) {
        this.f46613a = str;
        this.f46614b = i10;
        this.f46615c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46614b == a1Var.f46614b && this.f46615c == a1Var.f46615c && ((str2 = this.f46613a) == (str = a1Var.f46613a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46613a, Integer.valueOf(this.f46614b), Integer.valueOf(this.f46615c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.t(hg.c.k("WebIconParcelable{", this.f46614b, "x", this.f46615c, " - "), this.f46613a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46613a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46614b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46615c);
        w7.f0.r(parcel, q6);
    }
}
