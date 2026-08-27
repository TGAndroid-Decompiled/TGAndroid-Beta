package v5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import w3.b0;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new r6.l(26);

    public final String f48790a;

    public final int f48791b;

    public final long f48792c;

    public c(int i10, String str, long j10) {
        this.f48790a = str;
        this.f48791b = i10;
        this.f48792c = j10;
    }

    public final long b() {
        long j10 = this.f48792c;
        return j10 == -1 ? this.f48791b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f48790a;
            String str2 = this.f48790a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48790a, Long.valueOf(b())});
    }

    public final String toString() {
        b0 b0Var = new b0(this);
        b0Var.e(this.f48790a, "name");
        b0Var.e(Long.valueOf(b()), "version");
        return b0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f48790a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f48791b);
        long jB = b();
        r8.s(parcel, 3, 8);
        parcel.writeLong(jB);
        r8.r(parcel, iQ);
    }

    public c(String str, long j10) {
        this.f48790a = str;
        this.f48792c = j10;
        this.f48791b = -1;
    }
}
