package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new u6.p(5);
    public final int f45191a;
    public final int f45192b;
    public final long f45193c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f45191a = i10;
        this.f45192b = i11;
        this.f45193c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45191a == jVar.f45191a && this.f45192b == jVar.f45192b && this.f45193c == jVar.f45193c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45192b), Integer.valueOf(this.f45191a), Long.valueOf(this.d), Long.valueOf(this.f45193c)});
    }

    public final String toString() {
        StringBuilder m9 = e2.c.m("NetworkLocationStatus: Wifi status: ", this.f45191a, " Cell status: ", this.f45192b, " elapsed time NS: ");
        m9.append(this.d);
        m9.append(" system time ms: ");
        m9.append(this.f45193c);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f45191a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45192b);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f45193c);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f5.r(parcel, q10);
    }
}
