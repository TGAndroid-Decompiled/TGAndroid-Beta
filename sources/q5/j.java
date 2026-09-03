package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class j extends c6.a {
    public final long f44596a;
    public final long f44597b;
    public final boolean f44598c;
    public final boolean d;
    public static final u5.b f44595e = new u5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

    public j(long j10, long j11, boolean z4, boolean z10) {
        this.f44596a = Math.max(j10, 0L);
        this.f44597b = Math.max(j11, 0L);
        this.f44598c = z4;
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
        if (this.f44596a == jVar.f44596a && this.f44597b == jVar.f44597b && this.f44598c == jVar.f44598c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44596a), Long.valueOf(this.f44597b), Boolean.valueOf(this.f44598c), Boolean.valueOf(this.d)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f44596a);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f44597b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44598c ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.r(parcel, q10);
    }
}
