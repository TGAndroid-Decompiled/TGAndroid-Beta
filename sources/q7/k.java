package q7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new j(1);
    public final int f46110a;
    public final int f46111b;
    public final long f46112c;
    public final long d;

    public k(long j10, int i9, int i10, long j11) {
        this.f46110a = i9;
        this.f46111b = i10;
        this.f46112c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f46110a == kVar.f46110a && this.f46111b == kVar.f46111b && this.f46112c == kVar.f46112c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46111b), Integer.valueOf(this.f46110a), Long.valueOf(this.d), Long.valueOf(this.f46112c)});
    }

    public final String toString() {
        StringBuilder o6 = e2.c.o("NetworkLocationStatus: Wifi status: ", this.f46110a, " Cell status: ", this.f46111b, " elapsed time NS: ");
        o6.append(this.d);
        o6.append(" system time ms: ");
        o6.append(this.f46112c);
        return o6.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f46110a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f46111b);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.f46112c);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        p8.r(parcel, q10);
    }
}
