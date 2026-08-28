package q5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new o5.p(9);
    public double f46013a;
    public boolean f46014b;
    public int f46015c;
    public m5.d d;
    public int f46016e;
    public m5.x f46017f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f46013a == dVar.f46013a && this.f46014b == dVar.f46014b && this.f46015c == dVar.f46015c && a.d(this.d, dVar.d) && this.f46016e == dVar.f46016e) {
            m5.x xVar = this.f46017f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f46013a), Boolean.valueOf(this.f46014b), Integer.valueOf(this.f46015c), this.d, Integer.valueOf(this.f46016e), this.f46017f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f46013a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        double d = this.f46013a;
        p8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f46014b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f46015c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 5, this.d, i9);
        int i11 = this.f46016e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        p8.k(parcel, 7, this.f46017f, i9);
        double d9 = this.h;
        p8.s(parcel, 8, 8);
        parcel.writeDouble(d9);
        p8.r(parcel, q10);
    }
}
