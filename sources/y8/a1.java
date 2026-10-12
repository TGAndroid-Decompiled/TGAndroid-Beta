package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f51964a;
    public final int f51965b;
    public final int f51966c;

    public a1(String str, int i10, int i11) {
        this.f51964a = str;
        this.f51965b = i10;
        this.f51966c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f51965b == a1Var.f51965b && this.f51966c == a1Var.f51966c && ((str2 = this.f51964a) == (str = a1Var.f51964a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51964a, Integer.valueOf(this.f51965b), Integer.valueOf(this.f51966c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.t(hg.c.m("WebIconParcelable{", this.f51965b, "x", this.f51966c, " - "), this.f51964a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 1, this.f51964a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f51965b);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f51966c);
        w7.c0.r(parcel, q6);
    }
}
