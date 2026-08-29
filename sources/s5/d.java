package s5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import o6.w0;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(21);
    public double f47584a;
    public boolean f47585b;
    public int f47586c;
    public o5.d d;
    public int f47587e;
    public o5.x f47588f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47584a == dVar.f47584a && this.f47585b == dVar.f47585b && this.f47586c == dVar.f47586c && a.d(this.d, dVar.d) && this.f47587e == dVar.f47587e) {
            o5.x xVar = this.f47588f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f47584a), Boolean.valueOf(this.f47585b), Integer.valueOf(this.f47586c), this.d, Integer.valueOf(this.f47587e), this.f47588f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f47584a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        double d = this.f47584a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f47585b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f47586c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        int i12 = this.f47587e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f47588f, i10);
        double d10 = this.h;
        com.google.android.gms.internal.cast.o.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
