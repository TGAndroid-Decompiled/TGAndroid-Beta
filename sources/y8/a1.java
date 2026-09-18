package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46363a;
    public final int f46364b;
    public final int f46365c;

    public a1(String str, int i10, int i11) {
        this.f46363a = str;
        this.f46364b = i10;
        this.f46365c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46364b == a1Var.f46364b && this.f46365c == a1Var.f46365c && ((str2 = this.f46363a) == (str = a1Var.f46363a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46363a, Integer.valueOf(this.f46364b), Integer.valueOf(this.f46365c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hg.k0.m("WebIconParcelable{", this.f46364b, "x", this.f46365c, " - "), this.f46363a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f46363a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46364b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46365c);
        w7.e0.r(parcel, q6);
    }
}
