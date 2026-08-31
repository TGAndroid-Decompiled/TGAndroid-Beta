package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class c extends c6.a {
    public final long f44522a;
    public final long f44523b;
    public final String f44524c;
    public final String d;
    public final long f44525e;
    public static final u5.b f44521f = new u5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f44522a = j10;
        this.f44523b = j11;
        this.f44524c = str;
        this.d = str2;
        this.f44525e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f44522a == cVar.f44522a && this.f44523b == cVar.f44523b && u5.a.d(this.f44524c, cVar.f44524c) && u5.a.d(this.d, cVar.d) && this.f44525e == cVar.f44525e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44522a), Long.valueOf(this.f44523b), this.f44524c, this.d, Long.valueOf(this.f44525e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f44522a);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f44523b);
        g5.l(parcel, 4, this.f44524c);
        g5.l(parcel, 5, this.d);
        g5.s(parcel, 6, 8);
        parcel.writeLong(this.f44525e);
        g5.r(parcel, q10);
    }
}
