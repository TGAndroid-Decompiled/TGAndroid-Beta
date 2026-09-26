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
    public final boolean f45609a;
    public final byte[] f45610b;
    public final String f45611c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45609a = z10;
        this.f45610b = bArr;
        this.f45611c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45609a == cVar.f45609a && Arrays.equals(this.f45610b, cVar.f45610b) && Objects.equals(this.f45611c, cVar.f45611c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45610b) + (Objects.hash(Boolean.valueOf(this.f45609a), this.f45611c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45609a ? 1 : 0);
        f0.c(parcel, 2, this.f45610b);
        f0.l(parcel, 3, this.f45611c);
        f0.r(parcel, q6);
    }
}
