package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49971a;
    public final int f49972b;
    public final int f49973c;

    public a1(String str, int i10, int i11) {
        this.f49971a = str;
        this.f49972b = i10;
        this.f49973c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49972b == a1Var.f49972b && this.f49973c == a1Var.f49973c && ((str2 = this.f49971a) == (str = a1Var.f49971a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49971a, Integer.valueOf(this.f49972b), Integer.valueOf(this.f49973c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.e.m("WebIconParcelable{", this.f49972b, "x", this.f49973c, " - "), this.f49971a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49971a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49972b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49973c);
        w7.f0.r(parcel, q6);
    }
}
