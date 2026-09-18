package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46590a;
    public final int f46591b;
    public final int f46592c;

    public a1(String str, int i10, int i11) {
        this.f46590a = str;
        this.f46591b = i10;
        this.f46592c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46591b == a1Var.f46591b && this.f46592c == a1Var.f46592c && ((str2 = this.f46590a) == (str = a1Var.f46590a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46590a, Integer.valueOf(this.f46591b), Integer.valueOf(this.f46592c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hg.k0.k("WebIconParcelable{", this.f46591b, "x", this.f46592c, " - "), this.f46590a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46590a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46591b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46592c);
        w7.f0.r(parcel, q6);
    }
}
