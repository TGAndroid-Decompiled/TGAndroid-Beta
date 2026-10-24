package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.v8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f50432a;
    public final String f50433b;
    public final a1 f50434c;
    public final String d;
    public final String e;
    public final Float f50435f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f50432a = str;
        this.f50433b = str2;
        this.f50434c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f50435f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (v8.a(this.f50432a, c1Var.f50432a) && v8.a(this.f50433b, c1Var.f50433b) && v8.a(this.f50434c, c1Var.f50434c) && v8.a(this.d, c1Var.d) && v8.a(this.e, c1Var.e) && v8.a(this.f50435f, c1Var.f50435f) && v8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50432a, this.f50433b, this.f50434c, this.d, this.e, this.f50435f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f50434c);
        StringBuilder w9 = a1.g.w("AppParcelable{title='", this.f50433b, "', developerName='", this.d, "', formattedPrice='");
        w9.append(this.e);
        w9.append("', starRating=");
        w9.append(this.f50435f);
        w9.append(", wearDetails=");
        a1.g.A(w9, valueOf, ", deepLinkUri='", this.f50432a, "', icon=");
        return a1.g.s(w9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f50432a);
        w7.f0.l(parcel, 2, this.f50433b);
        w7.f0.k(parcel, 3, this.f50434c, i10);
        w7.f0.l(parcel, 4, this.d);
        w7.f0.l(parcel, 5, this.e);
        w7.f0.e(parcel, 6, this.f50435f);
        w7.f0.k(parcel, 7, this.h, i10);
        w7.f0.r(parcel, q6);
    }
}
