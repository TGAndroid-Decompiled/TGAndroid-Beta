package y5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(21);
    public final String f50763a;
    public final int f50764b;
    public final long f50765c;

    public c(int i10, String str, long j10) {
        this.f50763a = str;
        this.f50764b = i10;
        this.f50765c = j10;
    }

    public final long e() {
        long j10 = this.f50765c;
        if (j10 == -1) {
            return this.f50764b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f50763a;
            String str2 = this.f50763a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && e() == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50763a, Long.valueOf(e())});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.f50763a, "name");
        bVar.r(Long.valueOf(e()), "version");
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f50763a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f50764b);
        long e6 = e();
        g5.s(parcel, 3, 8);
        parcel.writeLong(e6);
        g5.r(parcel, q10);
    }

    public c(String str, long j10) {
        this.f50763a = str;
        this.f50765c = j10;
        this.f50764b = -1;
    }
}
