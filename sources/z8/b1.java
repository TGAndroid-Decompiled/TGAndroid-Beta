package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends p6.a {
    public static final Parcelable.Creator<b1> CREATOR = new d(26);
    public final String f52758a;
    public final int f52759b;
    public final int f52760c;

    public b1(String str, int i10, int i11) {
        this.f52758a = str;
        this.f52759b = i10;
        this.f52760c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f52759b == b1Var.f52759b && this.f52760c == b1Var.f52760c && ((str2 = this.f52758a) == (str = b1Var.f52758a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52758a, Integer.valueOf(this.f52759b), Integer.valueOf(this.f52760c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(c3.h0.n("WebIconParcelable{", this.f52759b, "x", this.f52760c, " - "), this.f52758a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52758a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52759b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52760c);
        df.r(parcel, q5);
    }
}
