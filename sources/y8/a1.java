package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f48582a;
    public final int f48583b;
    public final int f48584c;

    public a1(String str, int i10, int i11) {
        this.f48582a = str;
        this.f48583b = i10;
        this.f48584c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f48583b == a1Var.f48583b && this.f48584c == a1Var.f48584c && ((str2 = this.f48582a) == (str = a1Var.f48582a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48582a, Integer.valueOf(this.f48583b), Integer.valueOf(this.f48584c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.d.m("WebIconParcelable{", this.f48583b, "x", this.f48584c, " - "), this.f48582a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f48582a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48583b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48584c);
        w7.f0.r(parcel, q6);
    }
}
