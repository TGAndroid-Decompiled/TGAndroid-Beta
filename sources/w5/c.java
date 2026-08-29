package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(0);
    public final String f49764a;
    public final int f49765b;
    public final long f49766c;

    public c(int i10, String str, long j10) {
        this.f49764a = str;
        this.f49765b = i10;
        this.f49766c = j10;
    }

    public final long b() {
        long j10 = this.f49766c;
        if (j10 == -1) {
            return this.f49765b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f49764a;
            String str2 = this.f49764a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49764a, Long.valueOf(b())});
    }

    public final String toString() {
        v5.n nVar = new v5.n(this);
        nVar.g(this.f49764a, "name");
        nVar.g(Long.valueOf(b()), "version");
        return nVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f49764a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f49765b);
        long b10 = b();
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(b10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.f49764a = str;
        this.f49766c = j10;
        this.f49765b = -1;
    }
}
