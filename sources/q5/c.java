package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class c extends c6.a {
    public final long f44553a;
    public final long f44554b;
    public final String f44555c;
    public final String d;
    public final long f44556e;
    public static final u5.b f44552f = new u5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f44553a = j10;
        this.f44554b = j11;
        this.f44555c = str;
        this.d = str2;
        this.f44556e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f44553a == cVar.f44553a && this.f44554b == cVar.f44554b && u5.a.d(this.f44555c, cVar.f44555c) && u5.a.d(this.d, cVar.d) && this.f44556e == cVar.f44556e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44553a), Long.valueOf(this.f44554b), this.f44555c, this.d, Long.valueOf(this.f44556e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f44553a);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f44554b);
        g5.l(parcel, 4, this.f44555c);
        g5.l(parcel, 5, this.d);
        g5.s(parcel, 6, 8);
        parcel.writeLong(this.f44556e);
        g5.r(parcel, q10);
    }
}
