package w5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(11);
    public final boolean f46453a;
    public final long f46454b;
    public final long f46455c;

    public b(long j10, long j11, boolean z4) {
        this.f46453a = z4;
        this.f46454b = j10;
        this.f46455c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46453a == bVar.f46453a && this.f46454b == bVar.f46454b && this.f46455c == bVar.f46455c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46453a), Long.valueOf(this.f46454b), Long.valueOf(this.f46455c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.f46453a);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.f46454b);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        return android.support.v4.media.a.q(sb, this.f46455c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f46453a ? 1 : 0);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f46455c);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f46454b);
        f5.r(parcel, q10);
    }
}
