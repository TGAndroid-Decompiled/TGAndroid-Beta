package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.a9;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f50478a;
    public final String f50479b;
    public final a1 f50480c;
    public final String d;
    public final String f50481e;
    public final Float f50482f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.f50478a = str;
        this.f50479b = str2;
        this.f50480c = a1Var;
        this.d = str3;
        this.f50481e = str4;
        this.f50482f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (a9.a(this.f50478a, c1Var.f50478a) && a9.a(this.f50479b, c1Var.f50479b) && a9.a(this.f50480c, c1Var.f50480c) && a9.a(this.d, c1Var.d) && a9.a(this.f50481e, c1Var.f50481e) && a9.a(this.f50482f, c1Var.f50482f) && a9.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50478a, this.f50479b, this.f50480c, this.d, this.f50481e, this.f50482f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f50480c);
        StringBuilder x10 = a4.a.x("AppParcelable{title='", this.f50479b, "', developerName='", this.d, "', formattedPrice='");
        x10.append(this.f50481e);
        x10.append("', starRating=");
        x10.append(this.f50482f);
        x10.append(", wearDetails=");
        a4.a.A(x10, valueOf, ", deepLinkUri='", this.f50478a, "', icon=");
        return a4.a.t(x10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f50478a);
        w7.g0.l(parcel, 2, this.f50479b);
        w7.g0.k(parcel, 3, this.f50480c, i10);
        w7.g0.l(parcel, 4, this.d);
        w7.g0.l(parcel, 5, this.f50481e);
        w7.g0.e(parcel, 6, this.f50482f);
        w7.g0.k(parcel, 7, this.h, i10);
        w7.g0.r(parcel, q6);
    }
}
