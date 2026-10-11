package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.v8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f51846a;
    public final String f51847b;
    public final a1 f51848c;
    public final String d;
    public final String f51849e;
    public final Float f51850f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f51846a = str;
        this.f51847b = str2;
        this.f51848c = a1Var;
        this.d = str3;
        this.f51849e = str4;
        this.f51850f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (v8.a(this.f51846a, c1Var.f51846a) && v8.a(this.f51847b, c1Var.f51847b) && v8.a(this.f51848c, c1Var.f51848c) && v8.a(this.d, c1Var.d) && v8.a(this.f51849e, c1Var.f51849e) && v8.a(this.f51850f, c1Var.f51850f) && v8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51846a, this.f51847b, this.f51848c, this.d, this.f51849e, this.f51850f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f51848c);
        StringBuilder x10 = a1.g.x("AppParcelable{title='", this.f51847b, "', developerName='", this.d, "', formattedPrice='");
        x10.append(this.f51849e);
        x10.append("', starRating=");
        x10.append(this.f51850f);
        x10.append(", wearDetails=");
        a1.g.A(x10, valueOf, ", deepLinkUri='", this.f51846a, "', icon=");
        return a1.g.t(x10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f51846a);
        w7.d0.l(parcel, 2, this.f51847b);
        w7.d0.k(parcel, 3, this.f51848c, i10);
        w7.d0.l(parcel, 4, this.d);
        w7.d0.l(parcel, 5, this.f51849e);
        w7.d0.e(parcel, 6, this.f51850f);
        w7.d0.k(parcel, 7, this.h, i10);
        w7.d0.r(parcel, q6);
    }
}
