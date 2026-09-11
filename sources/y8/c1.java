package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.y8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f49581a;
    public final String f49582b;
    public final a1 f49583c;
    public final String d;
    public final String f49584e;
    public final Float f49585f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f49581a = str;
        this.f49582b = str2;
        this.f49583c = a1Var;
        this.d = str3;
        this.f49584e = str4;
        this.f49585f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (y8.a(this.f49581a, c1Var.f49581a) && y8.a(this.f49582b, c1Var.f49582b) && y8.a(this.f49583c, c1Var.f49583c) && y8.a(this.d, c1Var.d) && y8.a(this.f49584e, c1Var.f49584e) && y8.a(this.f49585f, c1Var.f49585f) && y8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49581a, this.f49582b, this.f49583c, this.d, this.f49584e, this.f49585f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f49583c);
        StringBuilder w10 = a4.a.w("AppParcelable{title='", this.f49582b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.f49584e);
        w10.append("', starRating=");
        w10.append(this.f49585f);
        w10.append(", wearDetails=");
        a4.a.z(w10, valueOf, ", deepLinkUri='", this.f49581a, "', icon=");
        return a4.a.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f49581a);
        w7.e0.l(parcel, 2, this.f49582b);
        w7.e0.k(parcel, 3, this.f49583c, i10);
        w7.e0.l(parcel, 4, this.d);
        w7.e0.l(parcel, 5, this.f49584e);
        w7.e0.e(parcel, 6, this.f49585f);
        w7.e0.k(parcel, 7, this.h, i10);
        w7.e0.r(parcel, q6);
    }
}
