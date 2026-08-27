package r7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new r6.l(9);

    public final int f46869a;

    public final int f46870b;

    public final long f46871c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f46869a = i10;
        this.f46870b = i11;
        this.f46871c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f46869a == jVar.f46869a && this.f46870b == jVar.f46870b && this.f46871c == jVar.f46871c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46870b), Integer.valueOf(this.f46869a), Long.valueOf(this.d), Long.valueOf(this.f46871c)});
    }

    public final String toString() {
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("NetworkLocationStatus: Wifi status: ", this.f46869a, " Cell status: ", this.f46870b, " elapsed time NS: ");
        sbP.append(this.d);
        sbP.append(" system time ms: ");
        sbP.append(this.f46871c);
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f46869a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f46870b);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.f46871c);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        r8.r(parcel, iQ);
    }
}
