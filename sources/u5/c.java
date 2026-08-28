package u5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new q7.j(18);
    public final String f48105a;
    public final int f48106b;
    public final long f48107c;

    public c(int i9, String str, long j10) {
        this.f48105a = str;
        this.f48106b = i9;
        this.f48107c = j10;
    }

    public final long b() {
        long j10 = this.f48107c;
        if (j10 == -1) {
            return this.f48106b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f48105a;
            String str2 = this.f48105a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48105a, Long.valueOf(b())});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        eVar.c(this.f48105a, "name");
        eVar.c(Long.valueOf(b()), "version");
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f48105a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48106b);
        long b10 = b();
        p8.s(parcel, 3, 8);
        parcel.writeLong(b10);
        p8.r(parcel, q10);
    }

    public c(String str, long j10) {
        this.f48105a = str;
        this.f48107c = j10;
        this.f48106b = -1;
    }
}
