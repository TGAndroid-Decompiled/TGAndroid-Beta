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
    public final boolean f50668a;
    public final byte[] f50669b;
    public final String f50670c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f50668a = z10;
        this.f50669b = bArr;
        this.f50670c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50668a == cVar.f50668a && Arrays.equals(this.f50669b, cVar.f50669b) && Objects.equals(this.f50670c, cVar.f50670c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50669b) + (Objects.hash(Boolean.valueOf(this.f50668a), this.f50670c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50668a ? 1 : 0);
        d0.c(parcel, 2, this.f50669b);
        d0.l(parcel, 3, this.f50670c);
        d0.r(parcel, q6);
    }
}
