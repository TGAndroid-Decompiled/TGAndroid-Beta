package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.z8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f46632a;
    public final String f46633b;
    public final a1 f46634c;
    public final String d;
    public final String e;
    public final Float f46635f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f46632a = str;
        this.f46633b = str2;
        this.f46634c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f46635f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (z8.a(this.f46632a, c1Var.f46632a) && z8.a(this.f46633b, c1Var.f46633b) && z8.a(this.f46634c, c1Var.f46634c) && z8.a(this.d, c1Var.d) && z8.a(this.e, c1Var.e) && z8.a(this.f46635f, c1Var.f46635f) && z8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46632a, this.f46633b, this.f46634c, this.d, this.e, this.f46635f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f46634c);
        StringBuilder x10 = a4.a.x("AppParcelable{title='", this.f46633b, "', developerName='", this.d, "', formattedPrice='");
        x10.append(this.e);
        x10.append("', starRating=");
        x10.append(this.f46635f);
        x10.append(", wearDetails=");
        a4.a.A(x10, valueOf, ", deepLinkUri='", this.f46632a, "', icon=");
        return a4.a.t(x10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46632a);
        w7.f0.l(parcel, 2, this.f46633b);
        w7.f0.k(parcel, 3, this.f46634c, i10);
        w7.f0.l(parcel, 4, this.d);
        w7.f0.l(parcel, 5, this.e);
        w7.f0.e(parcel, 6, this.f46635f);
        w7.f0.k(parcel, 7, this.h, i10);
        w7.f0.r(parcel, q6);
    }
}
