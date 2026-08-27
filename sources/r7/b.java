package r7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.q;
import h7.r8;
import java.util.Arrays;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new r6.l(10);

    public final long f46854a;

    public final int f46855b;

    public final boolean f46856c;
    public final String d;

    public final c7.k f46857e;

    public b(long j10, int i10, boolean z10, String str, c7.k kVar) {
        this.f46854a = j10;
        this.f46855b = i10;
        this.f46856c = z10;
        this.d = str;
        this.f46857e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f46854a == bVar.f46854a && this.f46855b == bVar.f46855b && this.f46856c == bVar.f46856c && y5.l.l(this.d, bVar.d) && y5.l.l(this.f46857e, bVar.f46857e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f46854a), Integer.valueOf(this.f46855b), Boolean.valueOf(this.f46856c)});
    }

    public final String toString() {
        String str;
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o("LastLocationRequest[");
        long j10 = this.f46854a;
        if (j10 != Long.MAX_VALUE) {
            sbO.append("maxAge=");
            q.a(sbO, j10);
        }
        int i10 = this.f46855b;
        if (i10 != 0) {
            sbO.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbO.append(str);
        }
        if (this.f46856c) {
            sbO.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            sbO.append(", moduleId=");
            sbO.append(str2);
        }
        c7.k kVar = this.f46857e;
        if (kVar != null) {
            sbO.append(", impersonation=");
            sbO.append(kVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 8);
        parcel.writeLong(this.f46854a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f46855b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f46856c ? 1 : 0);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.f46857e, i10);
        r8.r(parcel, iQ);
    }
}
