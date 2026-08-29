package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new s6.i(14);
    public final long f47666a;
    public final int f47667b;
    public final boolean f47668c;
    public final String d;
    public final d7.j f47669e;

    public b(long j10, int i10, boolean z10, String str, d7.j jVar) {
        this.f47666a = j10;
        this.f47667b = i10;
        this.f47668c = z10;
        this.d = str;
        this.f47669e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f47666a != bVar.f47666a || this.f47667b != bVar.f47667b || this.f47668c != bVar.f47668c || !z5.l.l(this.d, bVar.d) || !z5.l.l(this.f47669e, bVar.f47669e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47666a), Integer.valueOf(this.f47667b), Boolean.valueOf(this.f47668c)});
    }

    public final String toString() {
        String str;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("LastLocationRequest[");
        long j10 = this.f47666a;
        if (j10 != Long.MAX_VALUE) {
            n10.append("maxAge=");
            d7.p.a(n10, j10);
        }
        int i10 = this.f47667b;
        if (i10 != 0) {
            n10.append(", ");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "GRANULARITY_FINE";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "GRANULARITY_COARSE";
                }
            } else {
                str = "GRANULARITY_PERMISSION_LEVEL";
            }
            n10.append(str);
        }
        if (this.f47668c) {
            n10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            n10.append(", moduleId=");
            n10.append(str2);
        }
        d7.j jVar = this.f47669e;
        if (jVar != null) {
            n10.append(", impersonation=");
            n10.append(jVar);
        }
        n10.append(']');
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 8);
        parcel.writeLong(this.f47666a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f47667b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f47668c ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.f47669e, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
