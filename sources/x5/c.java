package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(27);
    public final boolean f47903a;
    public final byte[] f47904b;
    public final String f47905c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f47903a = z10;
        this.f47904b = bArr;
        this.f47905c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47903a == cVar.f47903a && Arrays.equals(this.f47904b, cVar.f47904b) && Objects.equals(this.f47905c, cVar.f47905c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47904b) + (Objects.hash(Boolean.valueOf(this.f47903a), this.f47905c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f47903a ? 1 : 0);
        g0.c(parcel, 2, this.f47904b);
        g0.l(parcel, 3, this.f47905c);
        g0.r(parcel, q6);
    }
}
