package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f50756a;
    public final byte[] f50757b;
    public final String f50758c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.h(bArr);
            m.h(str);
        }
        this.f50756a = z10;
        this.f50757b = bArr;
        this.f50758c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50756a == cVar.f50756a && Arrays.equals(this.f50757b, cVar.f50757b) && Objects.equals(this.f50758c, cVar.f50758c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50757b) + (Objects.hash(Boolean.valueOf(this.f50756a), this.f50758c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50756a ? 1 : 0);
        d0.c(parcel, 2, this.f50757b);
        d0.l(parcel, 3, this.f50758c);
        d0.r(parcel, q6);
    }
}
