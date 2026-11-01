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
    public final boolean f53087a;
    public final byte[] f53088b;
    public final String f53089c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.g(bArr);
            l.g(str);
        }
        this.f53087a = z10;
        this.f53088b = bArr;
        this.f53089c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f53087a == cVar.f53087a && Arrays.equals(this.f53088b, cVar.f53088b) && Objects.equals(this.f53089c, cVar.f53089c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f53088b) + (Objects.hash(Boolean.valueOf(this.f53087a), this.f53089c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53087a ? 1 : 0);
        h0.c(parcel, 2, this.f53088b);
        h0.l(parcel, 3, this.f53089c);
        h0.r(parcel, q6);
    }
}
