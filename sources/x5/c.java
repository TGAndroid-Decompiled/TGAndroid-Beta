package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(27);
    public final boolean f49336a;
    public final byte[] f49337b;
    public final String f49338c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49336a = z10;
        this.f49337b = bArr;
        this.f49338c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49336a == cVar.f49336a && Arrays.equals(this.f49337b, cVar.f49337b) && Objects.equals(this.f49338c, cVar.f49338c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49337b) + (Objects.hash(Boolean.valueOf(this.f49336a), this.f49338c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49336a ? 1 : 0);
        f0.c(parcel, 2, this.f49337b);
        f0.l(parcel, 3, this.f49338c);
        f0.r(parcel, q6);
    }
}
