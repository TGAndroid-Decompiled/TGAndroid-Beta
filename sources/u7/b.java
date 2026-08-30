package u7;

import android.os.Parcel;
import android.os.Parcelable;
import f7.q;
import j7.f5;
import java.util.Arrays;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new u6.p(6);
    public final long f45178a;
    public final int f45179b;
    public final boolean f45180c;
    public final String d;
    public final f7.k e;

    public b(long j10, int i10, boolean z4, String str, f7.k kVar) {
        this.f45178a = j10;
        this.f45179b = i10;
        this.f45180c = z4;
        this.d = str;
        this.e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f45178a != bVar.f45178a || this.f45179b != bVar.f45179b || this.f45180c != bVar.f45180c || !b6.m.l(this.d, bVar.d) || !b6.m.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f45178a), Integer.valueOf(this.f45179b), Boolean.valueOf(this.f45180c)});
    }

    public final String toString() {
        String str;
        StringBuilder l10 = e2.c.l("LastLocationRequest[");
        long j10 = this.f45178a;
        if (j10 != Long.MAX_VALUE) {
            l10.append("maxAge=");
            q.a(l10, j10);
        }
        int i10 = this.f45179b;
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
        if (this.f45180c) {
            l10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            l10.append(", moduleId=");
            l10.append(str2);
        }
        f7.k kVar = this.e;
        if (kVar != null) {
            l10.append(", impersonation=");
            l10.append(kVar);
        }
        l10.append(']');
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 8);
        parcel.writeLong(this.f45178a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45179b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f45180c ? 1 : 0);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.r(parcel, q10);
    }
}
