package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.k3;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f50415a;
    public final int f50416b;
    public final int f50417c;

    public a1(String str, int i10, int i11) {
        this.f50415a = str;
        this.f50416b = i10;
        this.f50417c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f50416b == a1Var.f50416b && this.f50417c == a1Var.f50417c && ((str2 = this.f50415a) == (str = a1Var.f50415a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50415a, Integer.valueOf(this.f50416b), Integer.valueOf(this.f50417c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.s(k3.k("WebIconParcelable{", this.f50416b, "x", this.f50417c, " - "), this.f50415a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f50415a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50416b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50417c);
        w7.f0.r(parcel, q6);
    }
}
