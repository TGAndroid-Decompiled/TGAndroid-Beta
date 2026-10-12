package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(28);
    public final boolean f50903a;
    public final String f50904b;

    public b(String str, boolean z10) {
        if (z10) {
            m.h(str);
        }
        this.f50903a = z10;
        this.f50904b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f50903a == bVar.f50903a && m.l(this.f50904b, bVar.f50904b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50903a), this.f50904b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f50903a ? 1 : 0);
        c0.l(parcel, 2, this.f50904b);
        c0.r(parcel, q6);
    }
}
