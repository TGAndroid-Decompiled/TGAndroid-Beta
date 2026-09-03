package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class j extends c6.a {
    public final long f42843a;
    public final long f42844b;
    public final boolean f42845c;
    public final boolean d;
    public static final u5.b e = new u5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z4, boolean z10) {
        this.f42843a = Math.max(j10, 0L);
        this.f42844b = Math.max(j11, 0L);
        this.f42845c = z4;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f42843a == jVar.f42843a && this.f42844b == jVar.f42844b && this.f42845c == jVar.f42845c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f42843a), Long.valueOf(this.f42844b), Boolean.valueOf(this.f42845c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f42843a);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f42844b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42845c ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
