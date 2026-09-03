package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class m0 extends c6.a {
    public static final Parcelable.Creator<m0> CREATOR = new l4.j(21);
    public final long f44729a;

    public m0(long j10) {
        this.f44729a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f44729a != ((m0) obj).f44729a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44729a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 8);
        parcel.writeLong(this.f44729a);
        g5.r(parcel, q10);
    }
}
