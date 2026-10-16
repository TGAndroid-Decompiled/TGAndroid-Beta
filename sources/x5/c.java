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
    public final boolean f47902a;
    public final byte[] f47903b;
    public final String f47904c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f47902a = z10;
        this.f47903b = bArr;
        this.f47904c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47902a == cVar.f47902a && Arrays.equals(this.f47903b, cVar.f47903b) && Objects.equals(this.f47904c, cVar.f47904c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47903b) + (Objects.hash(Boolean.valueOf(this.f47902a), this.f47904c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f47902a ? 1 : 0);
        f0.c(parcel, 2, this.f47903b);
        f0.l(parcel, 3, this.f47904c);
        f0.r(parcel, q6);
    }
}
