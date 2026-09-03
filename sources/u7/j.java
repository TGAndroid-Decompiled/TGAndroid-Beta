package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new u6.p(5);
    public final int f45253a;
    public final int f45254b;
    public final long f45255c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f45253a = i10;
        this.f45254b = i11;
        this.f45255c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45253a == jVar.f45253a && this.f45254b == jVar.f45254b && this.f45255c == jVar.f45255c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45254b), Integer.valueOf(this.f45253a), Long.valueOf(this.d), Long.valueOf(this.f45255c)});
    }

    public final String toString() {
        StringBuilder m9 = e2.c.m("NetworkLocationStatus: Wifi status: ", this.f45253a, " Cell status: ", this.f45254b, " elapsed time NS: ");
        m9.append(this.d);
        m9.append(" system time ms: ");
        m9.append(this.f45255c);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f45253a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45254b);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f45255c);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f5.r(parcel, q10);
    }
}
