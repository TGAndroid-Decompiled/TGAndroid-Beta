package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.n5;
public final class d1 extends p6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f52715a;
    public final String f52716b;
    public final b1 f52717c;
    public final String d;
    public final String e;
    public final Float f52718f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f7, f1 f1Var) {
        this.f52715a = str;
        this.f52716b = str2;
        this.f52717c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f52718f = f7;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (n5.a(this.f52715a, d1Var.f52715a) && n5.a(this.f52716b, d1Var.f52716b) && n5.a(this.f52717c, d1Var.f52717c) && n5.a(this.d, d1Var.d) && n5.a(this.e, d1Var.e) && n5.a(this.f52718f, d1Var.f52718f) && n5.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52715a, this.f52716b, this.f52717c, this.d, this.e, this.f52718f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f52717c);
        StringBuilder w10 = a1.g.w("AppParcelable{title='", this.f52716b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f52718f);
        w10.append(", wearDetails=");
        c3.h0.r(w10, valueOf, ", deepLinkUri='", this.f52715a, "', icon=");
        return a1.g.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52715a);
        df.l(parcel, 2, this.f52716b);
        df.k(parcel, 3, this.f52717c, i10);
        df.l(parcel, 4, this.d);
        df.l(parcel, 5, this.e);
        df.e(parcel, 6, this.f52718f);
        df.k(parcel, 7, this.h, i10);
        df.r(parcel, q5);
    }
}
