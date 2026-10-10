package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f50712a;
    public final byte[] f50713b;
    public final String f50714c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f50712a = z10;
        this.f50713b = bArr;
        this.f50714c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50712a == cVar.f50712a && Arrays.equals(this.f50713b, cVar.f50713b) && Objects.equals(this.f50714c, cVar.f50714c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50713b) + (Objects.hash(Boolean.valueOf(this.f50712a), this.f50714c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50712a ? 1 : 0);
        d0.c(parcel, 2, this.f50713b);
        d0.l(parcel, 3, this.f50714c);
        d0.r(parcel, q6);
    }
}
