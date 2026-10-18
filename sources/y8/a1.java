package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49965a;
    public final int f49966b;
    public final int f49967c;

    public a1(String str, int i10, int i11) {
        this.f49965a = str;
        this.f49966b = i10;
        this.f49967c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49966b == a1Var.f49966b && this.f49967c == a1Var.f49967c && ((str2 = this.f49965a) == (str = a1Var.f49965a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49965a, Integer.valueOf(this.f49966b), Integer.valueOf(this.f49967c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.d.m("WebIconParcelable{", this.f49966b, "x", this.f49967c, " - "), this.f49965a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49965a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49966b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49967c);
        w7.f0.r(parcel, q6);
    }
}
