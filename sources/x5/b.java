package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f48893a;
    public final String f48894b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f48893a = z10;
        this.f48894b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f48893a == bVar.f48893a && l.l(this.f48894b, bVar.f48894b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48893a), this.f48894b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f48893a ? 1 : 0);
        e0.l(parcel, 2, this.f48894b);
        e0.r(parcel, q6);
    }
}
