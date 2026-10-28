package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.o5;
public final class d1 extends p6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f52776a;
    public final String f52777b;
    public final b1 f52778c;
    public final String d;
    public final String e;
    public final Float f52779f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f7, f1 f1Var) {
        this.f52776a = str;
        this.f52777b = str2;
        this.f52778c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f52779f = f7;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (o5.a(this.f52776a, d1Var.f52776a) && o5.a(this.f52777b, d1Var.f52777b) && o5.a(this.f52778c, d1Var.f52778c) && o5.a(this.d, d1Var.d) && o5.a(this.e, d1Var.e) && o5.a(this.f52779f, d1Var.f52779f) && o5.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52776a, this.f52777b, this.f52778c, this.d, this.e, this.f52779f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f52778c);
        StringBuilder w10 = a1.g.w("AppParcelable{title='", this.f52777b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f52779f);
        w10.append(", wearDetails=");
        c3.h0.r(w10, valueOf, ", deepLinkUri='", this.f52776a, "', icon=");
        return a1.g.s(w10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52776a);
        df.l(parcel, 2, this.f52777b);
        df.k(parcel, 3, this.f52778c, i10);
        df.l(parcel, 4, this.d);
        df.l(parcel, 5, this.e);
        df.e(parcel, 6, this.f52779f);
        df.k(parcel, 7, this.h, i10);
        df.r(parcel, q5);
    }
}
