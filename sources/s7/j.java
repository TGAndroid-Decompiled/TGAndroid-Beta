package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new s6.i(13);
    public final int f47681a;
    public final int f47682b;
    public final long f47683c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f47681a = i10;
        this.f47682b = i11;
        this.f47683c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f47681a == jVar.f47681a && this.f47682b == jVar.f47682b && this.f47683c == jVar.f47683c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47682b), Integer.valueOf(this.f47681a), Long.valueOf(this.d), Long.valueOf(this.f47683c)});
    }

    public final String toString() {
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("NetworkLocationStatus: Wifi status: ", this.f47681a, " Cell status: ", this.f47682b, " elapsed time NS: ");
        o10.append(this.d);
        o10.append(" system time ms: ");
        o10.append(this.f47683c);
        return o10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f47681a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f47682b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.f47683c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
