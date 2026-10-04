package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f50452a;
    public final int f50453b;
    public final int f50454c;

    public a1(String str, int i10, int i11) {
        this.f50452a = str;
        this.f50453b = i10;
        this.f50454c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f50453b == a1Var.f50453b && this.f50454c == a1Var.f50454c && ((str2 = this.f50452a) == (str = a1Var.f50452a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50452a, Integer.valueOf(this.f50453b), Integer.valueOf(this.f50454c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.t(hg.c.k("WebIconParcelable{", this.f50453b, "x", this.f50454c, " - "), this.f50452a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f50452a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50453b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50454c);
        w7.g0.r(parcel, q6);
    }
}
