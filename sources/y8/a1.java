package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f50444a;
    public final int f50445b;
    public final int f50446c;

    public a1(String str, int i10, int i11) {
        this.f50444a = str;
        this.f50445b = i10;
        this.f50446c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f50445b == a1Var.f50445b && this.f50446c == a1Var.f50446c && ((str2 = this.f50444a) == (str = a1Var.f50444a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50444a, Integer.valueOf(this.f50445b), Integer.valueOf(this.f50446c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hg.k0.k("WebIconParcelable{", this.f50445b, "x", this.f50446c, " - "), this.f50444a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f50444a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50445b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50446c);
        w7.g0.r(parcel, q6);
    }
}
