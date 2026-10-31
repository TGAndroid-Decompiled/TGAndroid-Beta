package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(26);
    public final boolean f53069a;
    public final byte[] f53070b;
    public final String f53071c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.g(bArr);
            l.g(str);
        }
        this.f53069a = z10;
        this.f53070b = bArr;
        this.f53071c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f53069a == cVar.f53069a && Arrays.equals(this.f53070b, cVar.f53070b) && Objects.equals(this.f53071c, cVar.f53071c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f53070b) + (Objects.hash(Boolean.valueOf(this.f53069a), this.f53071c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53069a ? 1 : 0);
        h0.c(parcel, 2, this.f53070b);
        h0.l(parcel, 3, this.f53071c);
        h0.r(parcel, q6);
    }
}
