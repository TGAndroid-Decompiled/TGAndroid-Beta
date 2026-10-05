package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f49390a;
    public final String f49391b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f49390a = z10;
        this.f49391b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f49390a == bVar.f49390a && l.l(this.f49391b, bVar.f49391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49390a), this.f49391b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49390a ? 1 : 0);
        g0.l(parcel, 2, this.f49391b);
        g0.r(parcel, q6);
    }
}
