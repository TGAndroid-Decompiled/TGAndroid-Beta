package r5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import n6.w0;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(17);

    public double f46772a;

    public boolean f46773b;

    public int f46774c;
    public m5.d d;

    public int f46775e;

    public m5.y f46776f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f46772a == dVar.f46772a && this.f46773b == dVar.f46773b && this.f46774c == dVar.f46774c && a.d(this.d, dVar.d) && this.f46775e == dVar.f46775e) {
            m5.y yVar = this.f46776f;
            if (a.d(yVar, yVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f46772a), Boolean.valueOf(this.f46773b), Integer.valueOf(this.f46774c), this.d, Integer.valueOf(this.f46775e), this.f46776f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f46772a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        double d = this.f46772a;
        r8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f46773b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f46774c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.k(parcel, 5, this.d, i10);
        int i12 = this.f46775e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        r8.k(parcel, 7, this.f46776f, i10);
        double d10 = this.h;
        r8.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        r8.r(parcel, iQ);
    }
}
