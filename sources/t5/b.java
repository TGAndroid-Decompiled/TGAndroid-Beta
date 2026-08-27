package t5;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import r6.l;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new l(15);

    public final boolean f48090a;

    public final long f48091b;

    public final long f48092c;

    public b(long j10, long j11, boolean z10) {
        this.f48090a = z10;
        this.f48091b = j10;
        this.f48092c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48090a == bVar.f48090a && this.f48091b == bVar.f48091b && this.f48092c == bVar.f48092c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48090a), Long.valueOf(this.f48091b), Long.valueOf(this.f48092c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.f48090a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.f48091b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p.o(sb2, this.f48092c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f48090a ? 1 : 0);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f48092c);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.f48091b);
        r8.r(parcel, iQ);
    }
}
