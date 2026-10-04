package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f49376a;
    public final byte[] f49377b;
    public final String f49378c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49376a = z10;
        this.f49377b = bArr;
        this.f49378c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49376a == cVar.f49376a && Arrays.equals(this.f49377b, cVar.f49377b) && Objects.equals(this.f49378c, cVar.f49378c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49377b) + (Objects.hash(Boolean.valueOf(this.f49376a), this.f49378c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49376a ? 1 : 0);
        g0.c(parcel, 2, this.f49377b);
        g0.l(parcel, 3, this.f49378c);
        g0.r(parcel, q6);
    }
}
