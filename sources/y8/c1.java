package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.y8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f46503a;
    public final String f46504b;
    public final a1 f46505c;
    public final String d;
    public final String e;
    public final Float f46506f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f46503a = str;
        this.f46504b = str2;
        this.f46505c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f46506f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (y8.a(this.f46503a, c1Var.f46503a) && y8.a(this.f46504b, c1Var.f46504b) && y8.a(this.f46505c, c1Var.f46505c) && y8.a(this.d, c1Var.d) && y8.a(this.e, c1Var.e) && y8.a(this.f46506f, c1Var.f46506f) && y8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46503a, this.f46504b, this.f46505c, this.d, this.e, this.f46506f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f46505c);
        StringBuilder w10 = a4.a.w("AppParcelable{title='", this.f46504b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f46506f);
        w10.append(", wearDetails=");
        a4.a.z(w10, valueOf, ", deepLinkUri='", this.f46503a, "', icon=");
        return a4.a.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f46503a);
        w7.e0.l(parcel, 2, this.f46504b);
        w7.e0.k(parcel, 3, this.f46505c, i10);
        w7.e0.l(parcel, 4, this.d);
        w7.e0.l(parcel, 5, this.e);
        w7.e0.e(parcel, 6, this.f46506f);
        w7.e0.k(parcel, 7, this.h, i10);
        w7.e0.r(parcel, q6);
    }
}
