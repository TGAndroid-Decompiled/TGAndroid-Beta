package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f45583a;
    public final byte[] f45584b;
    public final String f45585c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45583a = z10;
        this.f45584b = bArr;
        this.f45585c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45583a == cVar.f45583a && Arrays.equals(this.f45584b, cVar.f45584b) && Objects.equals(this.f45585c, cVar.f45585c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45584b) + (Objects.hash(Boolean.valueOf(this.f45583a), this.f45585c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45583a ? 1 : 0);
        f0.c(parcel, 2, this.f45584b);
        f0.l(parcel, 3, this.f45585c);
        f0.r(parcel, q6);
    }
}
