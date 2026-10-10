package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f50710a;
    public final String f50711b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f50710a = z10;
        this.f50711b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f50710a == bVar.f50710a && l.l(this.f50711b, bVar.f50711b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50710a), this.f50711b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50710a ? 1 : 0);
        d0.l(parcel, 2, this.f50711b);
        d0.r(parcel, q6);
    }
}
