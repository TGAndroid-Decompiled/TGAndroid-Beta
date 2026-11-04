package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p6.m;
import y8.i;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(4);
    public final boolean f59770a;
    public final String f59771b;

    public b(String str, boolean z10) {
        if (z10) {
            m.g(str);
        }
        this.f59770a = z10;
        this.f59771b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f59770a == bVar.f59770a && m.k(this.f59771b, bVar.f59771b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59770a), this.f59771b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f59770a ? 1 : 0);
        j8.a.m(parcel, 2, this.f59771b);
        j8.a.t(parcel, s6);
    }
}
