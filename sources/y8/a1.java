package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f46603a;
    public final int f46604b;
    public final int f46605c;

    public a1(String str, int i10, int i11) {
        this.f46603a = str;
        this.f46604b = i10;
        this.f46605c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f46604b == a1Var.f46604b && this.f46605c == a1Var.f46605c && ((str2 = this.f46603a) == (str = a1Var.f46603a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46603a, Integer.valueOf(this.f46604b), Integer.valueOf(this.f46605c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.t(hg.c.k("WebIconParcelable{", this.f46604b, "x", this.f46605c, " - "), this.f46603a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46603a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46604b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46605c);
        w7.f0.r(parcel, q6);
    }
}
