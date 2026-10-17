package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.w8;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f50005a;
    public final String f50006b;
    public final a1 f50007c;
    public final String d;
    public final String e;
    public final Float f50008f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f50005a = str;
        this.f50006b = str2;
        this.f50007c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f50008f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (w8.a(this.f50005a, c1Var.f50005a) && w8.a(this.f50006b, c1Var.f50006b) && w8.a(this.f50007c, c1Var.f50007c) && w8.a(this.d, c1Var.d) && w8.a(this.e, c1Var.e) && w8.a(this.f50008f, c1Var.f50008f) && w8.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50005a, this.f50006b, this.f50007c, this.d, this.e, this.f50008f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f50007c);
        StringBuilder w9 = a1.g.w("AppParcelable{title='", this.f50006b, "', developerName='", this.d, "', formattedPrice='");
        w9.append(this.e);
        w9.append("', starRating=");
        w9.append(this.f50008f);
        w9.append(", wearDetails=");
        a1.g.A(w9, valueOf, ", deepLinkUri='", this.f50005a, "', icon=");
        return a1.g.s(w9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f50005a);
        w7.f0.l(parcel, 2, this.f50006b);
        w7.f0.k(parcel, 3, this.f50007c, i10);
        w7.f0.l(parcel, 4, this.d);
        w7.f0.l(parcel, 5, this.e);
        w7.f0.e(parcel, 6, this.f50008f);
        w7.f0.k(parcel, 7, this.h, i10);
        w7.f0.r(parcel, q6);
    }
}
