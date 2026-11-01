package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class y0 extends o6.a {
    public static final Parcelable.Creator<y0> CREATOR = new c(26);
    public final String f54326a;
    public final int f54327b;
    public final int f54328c;

    public y0(String str, int i10, int i11) {
        this.f54326a = str;
        this.f54327b = i10;
        this.f54328c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f54327b == y0Var.f54327b && this.f54328c == y0Var.f54328c && ((str2 = this.f54326a) == (str = y0Var.f54326a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54326a, Integer.valueOf(this.f54327b), Integer.valueOf(this.f54328c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.r(i0.a.m("WebIconParcelable{", this.f54327b, "x", this.f54328c, " - "), this.f54326a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 1, this.f54326a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54327b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54328c);
        w7.h0.r(parcel, q6);
    }
}
