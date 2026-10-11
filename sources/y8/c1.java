package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.v8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f51880a;
    public final String f51881b;
    public final a1 f51882c;
    public final String d;
    public final String f51883e;
    public final Float f51884f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f51880a = str;
        this.f51881b = str2;
        this.f51882c = a1Var;
        this.d = str3;
        this.f51883e = str4;
        this.f51884f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (v8.a(this.f51880a, c1Var.f51880a) && v8.a(this.f51881b, c1Var.f51881b) && v8.a(this.f51882c, c1Var.f51882c) && v8.a(this.d, c1Var.d) && v8.a(this.f51883e, c1Var.f51883e) && v8.a(this.f51884f, c1Var.f51884f) && v8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51880a, this.f51881b, this.f51882c, this.d, this.f51883e, this.f51884f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f51882c);
        StringBuilder x10 = a1.g.x("AppParcelable{title='", this.f51881b, "', developerName='", this.d, "', formattedPrice='");
        x10.append(this.f51883e);
        x10.append("', starRating=");
        x10.append(this.f51884f);
        x10.append(", wearDetails=");
        a1.g.A(x10, valueOf, ", deepLinkUri='", this.f51880a, "', icon=");
        return a1.g.t(x10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51880a);
        w7.d0.l(parcel, 2, this.f51881b);
        w7.d0.k(parcel, 3, this.f51882c, i10);
        w7.d0.l(parcel, 4, this.d);
        w7.d0.l(parcel, 5, this.f51883e);
        w7.d0.e(parcel, 6, this.f51884f);
        w7.d0.k(parcel, 7, this.h, i10);
        w7.d0.r(parcel, q6);
    }
}
