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
    public final boolean f49298a;
    public final byte[] f49299b;
    public final String f49300c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49298a = z10;
        this.f49299b = bArr;
        this.f49300c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49298a == cVar.f49298a && Arrays.equals(this.f49299b, cVar.f49299b) && Objects.equals(this.f49300c, cVar.f49300c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49299b) + (Objects.hash(Boolean.valueOf(this.f49298a), this.f49300c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49298a ? 1 : 0);
        f0.c(parcel, 2, this.f49299b);
        f0.l(parcel, 3, this.f49300c);
        f0.r(parcel, q6);
    }
}
