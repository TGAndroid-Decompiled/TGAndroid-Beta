package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49966a;
    public final int f49967b;
    public final int f49968c;

    public a1(String str, int i10, int i11) {
        this.f49966a = str;
        this.f49967b = i10;
        this.f49968c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49967b == a1Var.f49967b && this.f49968c == a1Var.f49968c && ((str2 = this.f49966a) == (str = a1Var.f49966a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49966a, Integer.valueOf(this.f49967b), Integer.valueOf(this.f49968c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(i2.e.m("WebIconParcelable{", this.f49967b, "x", this.f49968c, " - "), this.f49966a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49966a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49967b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f49968c);
        w7.f0.r(parcel, q6);
    }
}
