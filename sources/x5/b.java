package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(26);
    public final boolean f47900a;
    public final String f47901b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f47900a = z10;
        this.f47901b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f47900a == bVar.f47900a && l.l(this.f47901b, bVar.f47901b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47900a), this.f47901b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f47900a ? 1 : 0);
        f0.l(parcel, 2, this.f47901b);
        f0.r(parcel, q6);
    }
}
