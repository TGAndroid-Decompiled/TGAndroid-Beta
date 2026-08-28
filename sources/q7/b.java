package q7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.r;
import g7.p8;
import java.util.Arrays;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(2);
    public final long f46094a;
    public final int f46095b;
    public final boolean f46096c;
    public final String d;
    public final b7.l f46097e;

    public b(long j10, int i9, boolean z10, String str, b7.l lVar) {
        this.f46094a = j10;
        this.f46095b = i9;
        this.f46096c = z10;
        this.d = str;
        this.f46097e = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f46094a != bVar.f46094a || this.f46095b != bVar.f46095b || this.f46096c != bVar.f46096c || !x5.l.l(this.d, bVar.d) || !x5.l.l(this.f46097e, bVar.f46097e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f46094a), Integer.valueOf(this.f46095b), Boolean.valueOf(this.f46096c)});
    }

    public final String toString() {
        String str;
        StringBuilder n10 = e2.c.n("LastLocationRequest[");
        long j10 = this.f46094a;
        if (j10 != Long.MAX_VALUE) {
            n10.append("maxAge=");
            r.a(n10, j10);
        }
        int i9 = this.f46095b;
        if (i9 != 0) {
            n10.append(", ");
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
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
        if (this.f46096c) {
            n10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            n10.append(", moduleId=");
            n10.append(str2);
        }
        b7.l lVar = this.f46097e;
        if (lVar != null) {
            n10.append(", impersonation=");
            n10.append(lVar);
        }
        n10.append(']');
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 8);
        parcel.writeLong(this.f46094a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f46095b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f46096c ? 1 : 0);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.f46097e, i9);
        p8.r(parcel, q10);
    }
}
