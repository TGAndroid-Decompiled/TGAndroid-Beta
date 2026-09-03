package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
import r5.c0;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(13);
    public double f45164a;
    public boolean f45165b;
    public int f45166c;
    public q5.d d;
    public int e;
    public q5.x f45167f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f45164a == dVar.f45164a && this.f45165b == dVar.f45165b && this.f45166c == dVar.f45166c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            q5.x xVar = this.f45167f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f45164a), Boolean.valueOf(this.f45165b), Integer.valueOf(this.f45166c), this.d, Integer.valueOf(this.e), this.f45167f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f45164a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        double d = this.f45164a;
        f5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z4 = this.f45165b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i11 = this.f45166c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        f5.k(parcel, 7, this.f45167f, i10);
        double d10 = this.h;
        f5.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        f5.r(parcel, q10);
    }
}
