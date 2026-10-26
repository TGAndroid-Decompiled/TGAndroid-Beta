package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.n5;
public final class d1 extends p6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f52718a;
    public final String f52719b;
    public final b1 f52720c;
    public final String d;
    public final String e;
    public final Float f52721f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f7, f1 f1Var) {
        this.f52718a = str;
        this.f52719b = str2;
        this.f52720c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f52721f = f7;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (n5.a(this.f52718a, d1Var.f52718a) && n5.a(this.f52719b, d1Var.f52719b) && n5.a(this.f52720c, d1Var.f52720c) && n5.a(this.d, d1Var.d) && n5.a(this.e, d1Var.e) && n5.a(this.f52721f, d1Var.f52721f) && n5.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52718a, this.f52719b, this.f52720c, this.d, this.e, this.f52721f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f52720c);
        StringBuilder w10 = a1.g.w("AppParcelable{title='", this.f52719b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f52721f);
        w10.append(", wearDetails=");
        c3.h0.r(w10, valueOf, ", deepLinkUri='", this.f52718a, "', icon=");
        return a1.g.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52718a);
        df.l(parcel, 2, this.f52719b);
        df.k(parcel, 3, this.f52720c, i10);
        df.l(parcel, 4, this.d);
        df.l(parcel, 5, this.e);
        df.e(parcel, 6, this.f52721f);
        df.k(parcel, 7, this.h, i10);
        df.r(parcel, q5);
    }
}
