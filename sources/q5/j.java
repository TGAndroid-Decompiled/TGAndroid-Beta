package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class j extends c6.a {
    public final long f42813a;
    public final long f42814b;
    public final boolean f42815c;
    public final boolean d;
    public static final u5.b e = new u5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z4, boolean z10) {
        this.f42813a = Math.max(j10, 0L);
        this.f42814b = Math.max(j11, 0L);
        this.f42815c = z4;
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
        if (this.f42813a == jVar.f42813a && this.f42814b == jVar.f42814b && this.f42815c == jVar.f42815c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f42813a), Long.valueOf(this.f42814b), Boolean.valueOf(this.f42815c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f42813a);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f42814b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42815c ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
