package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.a9;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f50463a;
    public final String f50464b;
    public final a1 f50465c;
    public final String d;
    public final String f50466e;
    public final Float f50467f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f50463a = str;
        this.f50464b = str2;
        this.f50465c = a1Var;
        this.d = str3;
        this.f50466e = str4;
        this.f50467f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (a9.a(this.f50463a, c1Var.f50463a) && a9.a(this.f50464b, c1Var.f50464b) && a9.a(this.f50465c, c1Var.f50465c) && a9.a(this.d, c1Var.d) && a9.a(this.f50466e, c1Var.f50466e) && a9.a(this.f50467f, c1Var.f50467f) && a9.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50463a, this.f50464b, this.f50465c, this.d, this.f50466e, this.f50467f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f50465c);
        StringBuilder w10 = a4.a.w("AppParcelable{title='", this.f50464b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.f50466e);
        w10.append("', starRating=");
        w10.append(this.f50467f);
        w10.append(", wearDetails=");
        a4.a.z(w10, valueOf, ", deepLinkUri='", this.f50463a, "', icon=");
        return a4.a.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f50463a);
        w7.g0.l(parcel, 2, this.f50464b);
        w7.g0.k(parcel, 3, this.f50465c, i10);
        w7.g0.l(parcel, 4, this.d);
        w7.g0.l(parcel, 5, this.f50466e);
        w7.g0.e(parcel, 6, this.f50467f);
        w7.g0.k(parcel, 7, this.h, i10);
        w7.g0.r(parcel, q6);
    }
}
