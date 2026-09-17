package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49563a;
    public final int f49564b;
    public final int f49565c;

    public a1(String str, int i10, int i11) {
        this.f49563a = str;
        this.f49564b = i10;
        this.f49565c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49564b == a1Var.f49564b && this.f49565c == a1Var.f49565c && ((str2 = this.f49563a) == (str = a1Var.f49563a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49563a, Integer.valueOf(this.f49564b), Integer.valueOf(this.f49565c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(e2.k("WebIconParcelable{", this.f49564b, "x", this.f49565c, " - "), this.f49563a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f49563a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49564b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49565c);
        w7.e0.r(parcel, q6);
    }
}
