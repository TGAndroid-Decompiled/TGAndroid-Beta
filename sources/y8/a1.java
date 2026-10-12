package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f51972a;
    public final int f51973b;
    public final int f51974c;

    public a1(String str, int i10, int i11) {
        this.f51972a = str;
        this.f51973b = i10;
        this.f51974c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f51973b == a1Var.f51973b && this.f51974c == a1Var.f51974c && ((str2 = this.f51972a) == (str = a1Var.f51972a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51972a, Integer.valueOf(this.f51973b), Integer.valueOf(this.f51974c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.t(hg.c.m("WebIconParcelable{", this.f51973b, "x", this.f51974c, " - "), this.f51972a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 1, this.f51972a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f51973b);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f51974c);
        w7.c0.r(parcel, q6);
    }
}
