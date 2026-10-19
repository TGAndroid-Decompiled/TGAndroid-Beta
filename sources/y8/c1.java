package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.v8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f49982a;
    public final String f49983b;
    public final a1 f49984c;
    public final String d;
    public final String e;
    public final Float f49985f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f49982a = str;
        this.f49983b = str2;
        this.f49984c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f49985f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (v8.a(this.f49982a, c1Var.f49982a) && v8.a(this.f49983b, c1Var.f49983b) && v8.a(this.f49984c, c1Var.f49984c) && v8.a(this.d, c1Var.d) && v8.a(this.e, c1Var.e) && v8.a(this.f49985f, c1Var.f49985f) && v8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49982a, this.f49983b, this.f49984c, this.d, this.e, this.f49985f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f49984c);
        StringBuilder w9 = a1.g.w("AppParcelable{title='", this.f49983b, "', developerName='", this.d, "', formattedPrice='");
        w9.append(this.e);
        w9.append("', starRating=");
        w9.append(this.f49985f);
        w9.append(", wearDetails=");
        a1.g.A(w9, valueOf, ", deepLinkUri='", this.f49982a, "', icon=");
        return a1.g.s(w9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f49982a);
        w7.f0.l(parcel, 2, this.f49983b);
        w7.f0.k(parcel, 3, this.f49984c, i10);
        w7.f0.l(parcel, 4, this.d);
        w7.f0.l(parcel, 5, this.e);
        w7.f0.e(parcel, 6, this.f49985f);
        w7.f0.k(parcel, 7, this.h, i10);
        w7.f0.r(parcel, q6);
    }
}
