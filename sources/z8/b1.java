package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends p6.a {
    public static final Parcelable.Creator<b1> CREATOR = new d(26);
    public final String f52697a;
    public final int f52698b;
    public final int f52699c;

    public b1(String str, int i10, int i11) {
        this.f52697a = str;
        this.f52698b = i10;
        this.f52699c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f52698b == b1Var.f52698b && this.f52699c == b1Var.f52699c && ((str2 = this.f52697a) == (str = b1Var.f52697a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52697a, Integer.valueOf(this.f52698b), Integer.valueOf(this.f52699c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(c3.h0.n("WebIconParcelable{", this.f52698b, "x", this.f52699c, " - "), this.f52697a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52697a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52698b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52699c);
        df.r(parcel, q5);
    }
}
