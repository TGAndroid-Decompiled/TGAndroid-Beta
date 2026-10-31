package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(25);
    public final boolean f53067a;
    public final String f53068b;

    public b(String str, boolean z10) {
        if (z10) {
            l.g(str);
        }
        this.f53067a = z10;
        this.f53068b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f53067a == bVar.f53067a && l.k(this.f53068b, bVar.f53068b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f53067a), this.f53068b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53067a ? 1 : 0);
        h0.l(parcel, 2, this.f53068b);
        h0.r(parcel, q6);
    }
}
