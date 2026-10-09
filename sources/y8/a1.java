package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f51738a;
    public final int f51739b;
    public final int f51740c;

    public a1(String str, int i10, int i11) {
        this.f51738a = str;
        this.f51739b = i10;
        this.f51740c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f51739b == a1Var.f51739b && this.f51740c == a1Var.f51740c && ((str2 = this.f51738a) == (str = a1Var.f51738a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51738a, Integer.valueOf(this.f51739b), Integer.valueOf(this.f51740c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.t(hg.c.k("WebIconParcelable{", this.f51739b, "x", this.f51740c, " - "), this.f51738a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51738a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51739b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51740c);
        w7.d0.r(parcel, q6);
    }
}
