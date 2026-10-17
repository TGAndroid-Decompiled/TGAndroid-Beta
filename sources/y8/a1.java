package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49987a;
    public final int f49988b;
    public final int f49989c;

    public a1(String str, int i10, int i11) {
        this.f49987a = str;
        this.f49988b = i10;
        this.f49989c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49988b == a1Var.f49988b && this.f49989c == a1Var.f49989c && ((str2 = this.f49987a) == (str = a1Var.f49987a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49987a, Integer.valueOf(this.f49988b), Integer.valueOf(this.f49989c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i0.a.m("WebIconParcelable{", this.f49988b, "x", this.f49989c, " - "), this.f49987a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49987a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49988b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49989c);
        w7.f0.r(parcel, q6);
    }
}
