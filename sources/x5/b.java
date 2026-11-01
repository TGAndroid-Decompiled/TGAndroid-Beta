package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(25);
    public final boolean f53085a;
    public final String f53086b;

    public b(String str, boolean z10) {
        if (z10) {
            l.g(str);
        }
        this.f53085a = z10;
        this.f53086b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f53085a == bVar.f53085a && l.k(this.f53086b, bVar.f53086b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f53085a), this.f53086b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53085a ? 1 : 0);
        h0.l(parcel, 2, this.f53086b);
        h0.r(parcel, q6);
    }
}
