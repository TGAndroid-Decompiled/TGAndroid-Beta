package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import java.util.Locale;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(13);
    public double f48389a;
    public boolean f48390b;
    public int f48391c;
    public q5.d d;
    public int f48392e;
    public q5.x f48393f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f48389a == dVar.f48389a && this.f48390b == dVar.f48390b && this.f48391c == dVar.f48391c && a.d(this.d, dVar.d) && this.f48392e == dVar.f48392e) {
            q5.x xVar = this.f48393f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f48389a), Boolean.valueOf(this.f48390b), Integer.valueOf(this.f48391c), this.d, Integer.valueOf(this.f48392e), this.f48393f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f48389a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        double d = this.f48389a;
        g5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z4 = this.f48390b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i11 = this.f48391c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.k(parcel, 5, this.d, i10);
        int i12 = this.f48392e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        g5.k(parcel, 7, this.f48393f, i10);
        double d10 = this.h;
        g5.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        g5.r(parcel, q10);
    }
}
