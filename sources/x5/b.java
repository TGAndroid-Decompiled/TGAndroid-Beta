package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(26);
    public final boolean f49738a;
    public final String f49739b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f49738a = z10;
        this.f49739b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f49738a == bVar.f49738a && l.l(this.f49739b, bVar.f49739b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49738a), this.f49739b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49738a ? 1 : 0);
        f0.l(parcel, 2, this.f49739b);
        f0.r(parcel, q6);
    }
}
