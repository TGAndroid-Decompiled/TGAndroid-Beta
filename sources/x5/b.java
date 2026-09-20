package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f45626a;
    public final String f45627b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f45626a = z10;
        this.f45627b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f45626a == bVar.f45626a && l.l(this.f45627b, bVar.f45627b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45626a), this.f45627b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45626a ? 1 : 0);
        f0.l(parcel, 2, this.f45627b);
        f0.r(parcel, q6);
    }
}
