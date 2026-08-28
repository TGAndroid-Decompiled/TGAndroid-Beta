package s5;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final boolean f47441a;
    public final long f47442b;
    public final long f47443c;

    public b(long j10, long j11, boolean z10) {
        this.f47441a = z10;
        this.f47442b = j10;
        this.f47443c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47441a == bVar.f47441a && this.f47442b == bVar.f47442b && this.f47443c == bVar.f47443c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47441a), Long.valueOf(this.f47442b), Long.valueOf(this.f47443c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f47441a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f47442b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return d.q(sb2, this.f47443c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f47441a ? 1 : 0);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f47443c);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.f47442b);
        p8.r(parcel, q10);
    }
}
