package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f50012a;
    public final int f50013b;
    public final int f50014c;

    public a1(String str, int i10, int i11) {
        this.f50012a = str;
        this.f50013b = i10;
        this.f50014c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f50013b == a1Var.f50013b && this.f50014c == a1Var.f50014c && ((str2 = this.f50012a) == (str = a1Var.f50012a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50012a, Integer.valueOf(this.f50013b), Integer.valueOf(this.f50014c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.d.m("WebIconParcelable{", this.f50013b, "x", this.f50014c, " - "), this.f50012a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f50012a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50013b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50014c);
        w7.f0.r(parcel, q6);
    }
}
