package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f49591a;
    public final int f49592b;
    public final int f49593c;

    public a1(String str, int i10, int i11) {
        this.f49591a = str;
        this.f49592b = i10;
        this.f49593c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f49592b == a1Var.f49592b && this.f49593c == a1Var.f49593c && ((str2 = this.f49591a) == (str = a1Var.f49591a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49591a, Integer.valueOf(this.f49592b), Integer.valueOf(this.f49593c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.a.s(e2.k("WebIconParcelable{", this.f49592b, "x", this.f49593c, " - "), this.f49591a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f49591a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49592b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49593c);
        w7.e0.r(parcel, q6);
    }
}
