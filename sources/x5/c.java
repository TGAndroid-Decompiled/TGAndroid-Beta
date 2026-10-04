package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f49377a;
    public final byte[] f49378b;
    public final String f49379c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49377a = z10;
        this.f49378b = bArr;
        this.f49379c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49377a == cVar.f49377a && Arrays.equals(this.f49378b, cVar.f49378b) && Objects.equals(this.f49379c, cVar.f49379c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49378b) + (Objects.hash(Boolean.valueOf(this.f49377a), this.f49379c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49377a ? 1 : 0);
        g0.c(parcel, 2, this.f49378b);
        g0.l(parcel, 3, this.f49379c);
        g0.r(parcel, q6);
    }
}
