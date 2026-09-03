package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new u6.p(5);
    public final int f48486a;
    public final int f48487b;
    public final long f48488c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f48486a = i10;
        this.f48487b = i11;
        this.f48488c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f48486a == jVar.f48486a && this.f48487b == jVar.f48487b && this.f48488c == jVar.f48488c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48487b), Integer.valueOf(this.f48486a), Long.valueOf(this.d), Long.valueOf(this.f48488c)});
    }

    public final String toString() {
        StringBuilder m9 = e2.c.m("NetworkLocationStatus: Wifi status: ", this.f48486a, " Cell status: ", this.f48487b, " elapsed time NS: ");
        m9.append(this.d);
        m9.append(" system time ms: ");
        m9.append(this.f48488c);
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f48486a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f48487b);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f48488c);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g5.r(parcel, q10);
    }
}
