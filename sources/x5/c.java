package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f45332a;
    public final byte[] f45333b;
    public final String f45334c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45332a = z10;
        this.f45333b = bArr;
        this.f45334c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45332a == cVar.f45332a && Arrays.equals(this.f45333b, cVar.f45333b) && Objects.equals(this.f45334c, cVar.f45334c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45333b) + (Objects.hash(Boolean.valueOf(this.f45332a), this.f45334c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f45332a ? 1 : 0);
        e0.c(parcel, 2, this.f45333b);
        e0.l(parcel, 3, this.f45334c);
        e0.r(parcel, q6);
    }
}
