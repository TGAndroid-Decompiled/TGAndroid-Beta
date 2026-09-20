package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46637a;
    public final int f46638b;
    public final int f46639c;

    public a1(String str, int i10, int i11) {
        this.f46637a = str;
        this.f46638b = i10;
        this.f46639c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46638b == a1Var.f46638b && this.f46639c == a1Var.f46639c && ((str2 = this.f46637a) == (str = a1Var.f46637a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46637a, Integer.valueOf(this.f46638b), Integer.valueOf(this.f46639c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hg.k0.l("WebIconParcelable{", this.f46638b, "x", this.f46639c, " - "), this.f46637a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46637a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46638b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46639c);
        w7.f0.r(parcel, q6);
    }
}
