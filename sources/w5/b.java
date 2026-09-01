package w5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(11);
    public final boolean f49426a;
    public final long f49427b;
    public final long f49428c;

    public b(long j10, long j11, boolean z4) {
        this.f49426a = z4;
        this.f49427b = j10;
        this.f49428c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f49426a == bVar.f49426a && this.f49427b == bVar.f49427b && this.f49428c == bVar.f49428c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49426a), Long.valueOf(this.f49427b), Long.valueOf(this.f49428c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.f49426a);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.f49427b);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        return android.support.v4.media.a.q(sb, this.f49428c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f49426a ? 1 : 0);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f49428c);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f49427b);
        g5.r(parcel, q10);
    }
}
