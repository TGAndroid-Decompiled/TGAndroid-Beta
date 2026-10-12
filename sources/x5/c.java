package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f50897a;
    public final byte[] f50898b;
    public final String f50899c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.h(bArr);
            m.h(str);
        }
        this.f50897a = z10;
        this.f50898b = bArr;
        this.f50899c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50897a == cVar.f50897a && Arrays.equals(this.f50898b, cVar.f50898b) && Objects.equals(this.f50899c, cVar.f50899c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50898b) + (Objects.hash(Boolean.valueOf(this.f50897a), this.f50899c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f50897a ? 1 : 0);
        c0.c(parcel, 2, this.f50898b);
        c0.l(parcel, 3, this.f50899c);
        c0.r(parcel, q6);
    }
}
