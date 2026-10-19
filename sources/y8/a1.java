package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49964a;
    public final int f49965b;
    public final int f49966c;

    public a1(String str, int i10, int i11) {
        this.f49964a = str;
        this.f49965b = i10;
        this.f49966c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49965b == a1Var.f49965b && this.f49966c == a1Var.f49966c && ((str2 = this.f49964a) == (str = a1Var.f49964a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49964a, Integer.valueOf(this.f49965b), Integer.valueOf(this.f49966c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.e.m("WebIconParcelable{", this.f49965b, "x", this.f49966c, " - "), this.f49964a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49964a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49965b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49966c);
        w7.f0.r(parcel, q6);
    }
}
