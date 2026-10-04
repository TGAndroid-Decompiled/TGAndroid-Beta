package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f50443a;
    public final int f50444b;
    public final int f50445c;

    public a1(String str, int i10, int i11) {
        this.f50443a = str;
        this.f50444b = i10;
        this.f50445c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f50444b == a1Var.f50444b && this.f50445c == a1Var.f50445c && ((str2 = this.f50443a) == (str = a1Var.f50443a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50443a, Integer.valueOf(this.f50444b), Integer.valueOf(this.f50445c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hg.k0.k("WebIconParcelable{", this.f50444b, "x", this.f50445c, " - "), this.f50443a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f50443a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50444b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50445c);
        w7.g0.r(parcel, q6);
    }
}
