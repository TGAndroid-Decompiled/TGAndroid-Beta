package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(26);
    public final boolean f49296a;
    public final String f49297b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f49296a = z10;
        this.f49297b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f49296a == bVar.f49296a && l.l(this.f49297b, bVar.f49297b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49296a), this.f49297b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49296a ? 1 : 0);
        f0.l(parcel, 2, this.f49297b);
        f0.r(parcel, q6);
    }
}
