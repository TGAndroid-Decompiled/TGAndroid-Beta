package u7;

import android.os.Parcel;
import android.os.Parcelable;
import f7.q;
import j7.g5;
import java.util.Arrays;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new u6.p(6);
    public final long f48435a;
    public final int f48436b;
    public final boolean f48437c;
    public final String d;
    public final f7.k f48438e;

    public b(long j10, int i10, boolean z4, String str, f7.k kVar) {
        this.f48435a = j10;
        this.f48436b = i10;
        this.f48437c = z4;
        this.d = str;
        this.f48438e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f48435a != bVar.f48435a || this.f48436b != bVar.f48436b || this.f48437c != bVar.f48437c || !b6.m.l(this.d, bVar.d) || !b6.m.l(this.f48438e, bVar.f48438e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f48435a), Integer.valueOf(this.f48436b), Boolean.valueOf(this.f48437c)});
    }

    public final String toString() {
        String str;
        StringBuilder l10 = e2.c.l("LastLocationRequest[");
        long j10 = this.f48435a;
        if (j10 != Long.MAX_VALUE) {
            l10.append("maxAge=");
            q.a(l10, j10);
        }
        int i10 = this.f48436b;
        if (i10 != 0) {
            l10.append(", ");
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
            l10.append(str);
        }
        if (this.f48437c) {
            l10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            l10.append(", moduleId=");
            l10.append(str2);
        }
        f7.k kVar = this.f48438e;
        if (kVar != null) {
            l10.append(", impersonation=");
            l10.append(kVar);
        }
        l10.append(']');
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 8);
        parcel.writeLong(this.f48435a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f48436b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f48437c ? 1 : 0);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.f48438e, i10);
        g5.r(parcel, q10);
    }
}
