package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(26);
    public final boolean f47901a;
    public final String f47902b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f47901a = z10;
        this.f47902b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f47901a == bVar.f47901a && l.l(this.f47902b, bVar.f47902b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47901a), this.f47902b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f47901a ? 1 : 0);
        g0.l(parcel, 2, this.f47902b);
        g0.r(parcel, q6);
    }
}
