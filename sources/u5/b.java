package u5;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import s6.i;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(20);
    public final boolean f49105a;
    public final long f49106b;
    public final long f49107c;

    public b(long j10, long j11, boolean z10) {
        this.f49105a = z10;
        this.f49106b = j10;
        this.f49107c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f49105a == bVar.f49105a && this.f49106b == bVar.f49106b && this.f49107c == bVar.f49107c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49105a), Long.valueOf(this.f49106b), Long.valueOf(this.f49107c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f49105a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f49106b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return w.p(sb2, this.f49107c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f49105a ? 1 : 0);
        o.s(parcel, 2, 8);
        parcel.writeLong(this.f49107c);
        o.s(parcel, 3, 8);
        parcel.writeLong(this.f49106b);
        o.r(parcel, q6);
    }
}
