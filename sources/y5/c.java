package y5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import u6.p;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(21);
    public final String f47171a;
    public final int f47172b;
    public final long f47173c;

    public c(int i10, String str, long j10) {
        this.f47171a = str;
        this.f47172b = i10;
        this.f47173c = j10;
    }

    public final long e() {
        long j10 = this.f47173c;
        if (j10 == -1) {
            return this.f47172b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f47171a;
            String str2 = this.f47171a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && e() == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47171a, Long.valueOf(e())});
    }

    public final String toString() {
        af.c cVar = new af.c(this);
        cVar.s(this.f47171a, "name");
        cVar.s(Long.valueOf(e()), "version");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f47171a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f47172b);
        long e = e();
        f5.s(parcel, 3, 8);
        parcel.writeLong(e);
        f5.r(parcel, q10);
    }

    public c(String str, long j10) {
        this.f47171a = str;
        this.f47173c = j10;
        this.f47172b = -1;
    }
}
