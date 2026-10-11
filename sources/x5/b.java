package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f50754a;
    public final String f50755b;

    public b(String str, boolean z10) {
        if (z10) {
            m.h(str);
        }
        this.f50754a = z10;
        this.f50755b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f50754a == bVar.f50754a && m.l(this.f50755b, bVar.f50755b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50754a), this.f50755b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50754a ? 1 : 0);
        d0.l(parcel, 2, this.f50755b);
        d0.r(parcel, q6);
    }
}
