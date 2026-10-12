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
    public final boolean f50905a;
    public final byte[] f50906b;
    public final String f50907c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.h(bArr);
            m.h(str);
        }
        this.f50905a = z10;
        this.f50906b = bArr;
        this.f50907c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50905a == cVar.f50905a && Arrays.equals(this.f50906b, cVar.f50906b) && Objects.equals(this.f50907c, cVar.f50907c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50906b) + (Objects.hash(Boolean.valueOf(this.f50905a), this.f50907c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f50905a ? 1 : 0);
        c0.c(parcel, 2, this.f50906b);
        c0.l(parcel, 3, this.f50907c);
        c0.r(parcel, q6);
    }
}
