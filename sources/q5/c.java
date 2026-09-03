package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class c extends c6.a {
    public final long f42803a;
    public final long f42804b;
    public final String f42805c;
    public final String d;
    public final long e;
    public static final u5.b f42802f = new u5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f42803a = j10;
        this.f42804b = j11;
        this.f42805c = str;
        this.d = str2;
        this.e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f42803a == cVar.f42803a && this.f42804b == cVar.f42804b && u5.a.d(this.f42805c, cVar.f42805c) && u5.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f42803a), Long.valueOf(this.f42804b), this.f42805c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f42803a);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f42804b);
        f5.l(parcel, 4, this.f42805c);
        f5.l(parcel, 5, this.d);
        f5.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        f5.r(parcel, q10);
    }
}
