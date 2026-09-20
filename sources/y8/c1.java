package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.a9;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f46655a;
    public final String f46656b;
    public final a1 f46657c;
    public final String d;
    public final String e;
    public final Float f46658f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f46655a = str;
        this.f46656b = str2;
        this.f46657c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f46658f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (a9.a(this.f46655a, c1Var.f46655a) && a9.a(this.f46656b, c1Var.f46656b) && a9.a(this.f46657c, c1Var.f46657c) && a9.a(this.d, c1Var.d) && a9.a(this.e, c1Var.e) && a9.a(this.f46658f, c1Var.f46658f) && a9.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46655a, this.f46656b, this.f46657c, this.d, this.e, this.f46658f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f46657c);
        StringBuilder w10 = a4.a.w("AppParcelable{title='", this.f46656b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f46658f);
        w10.append(", wearDetails=");
        a4.a.z(w10, valueOf, ", deepLinkUri='", this.f46655a, "', icon=");
        return a4.a.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f46655a);
        w7.f0.l(parcel, 2, this.f46656b);
        w7.f0.k(parcel, 3, this.f46657c, i10);
        w7.f0.l(parcel, 4, this.d);
        w7.f0.l(parcel, 5, this.e);
        w7.f0.e(parcel, 6, this.f46658f);
        w7.f0.k(parcel, 7, this.h, i10);
        w7.f0.r(parcel, q6);
    }
}
