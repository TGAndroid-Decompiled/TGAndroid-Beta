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
    public final boolean f50666a;
    public final byte[] f50667b;
    public final String f50668c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f50666a = z10;
        this.f50667b = bArr;
        this.f50668c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50666a == cVar.f50666a && Arrays.equals(this.f50667b, cVar.f50667b) && Objects.equals(this.f50668c, cVar.f50668c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50667b) + (Objects.hash(Boolean.valueOf(this.f50666a), this.f50668c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50666a ? 1 : 0);
        d0.c(parcel, 2, this.f50667b);
        d0.l(parcel, 3, this.f50668c);
        d0.r(parcel, q6);
    }
}
