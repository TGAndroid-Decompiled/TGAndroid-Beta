package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46485a;
    public final int f46486b;
    public final int f46487c;

    public a1(String str, int i10, int i11) {
        this.f46485a = str;
        this.f46486b = i10;
        this.f46487c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46486b == a1Var.f46486b && this.f46487c == a1Var.f46487c && ((str2 = this.f46485a) == (str = a1Var.f46485a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46485a, Integer.valueOf(this.f46486b), Integer.valueOf(this.f46487c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(hc.b.n("WebIconParcelable{", this.f46486b, "x", this.f46487c, " - "), this.f46485a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f46485a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46486b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46487c);
        w7.e0.r(parcel, q6);
    }
}
