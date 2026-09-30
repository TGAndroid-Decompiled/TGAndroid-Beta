package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46616a;
    public final int f46617b;
    public final int f46618c;

    public a1(String str, int i10, int i11) {
        this.f46616a = str;
        this.f46617b = i10;
        this.f46618c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46617b == a1Var.f46617b && this.f46618c == a1Var.f46618c && ((str2 = this.f46616a) == (str = a1Var.f46616a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46616a, Integer.valueOf(this.f46617b), Integer.valueOf(this.f46618c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.t(hg.c.k("WebIconParcelable{", this.f46617b, "x", this.f46618c, " - "), this.f46616a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46616a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46617b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46618c);
        w7.f0.r(parcel, q6);
    }
}
