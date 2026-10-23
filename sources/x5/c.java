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
    public final boolean f49741a;
    public final byte[] f49742b;
    public final String f49743c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49741a = z10;
        this.f49742b = bArr;
        this.f49743c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49741a == cVar.f49741a && Arrays.equals(this.f49742b, cVar.f49742b) && Objects.equals(this.f49743c, cVar.f49743c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49742b) + (Objects.hash(Boolean.valueOf(this.f49741a), this.f49743c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49741a ? 1 : 0);
        f0.c(parcel, 2, this.f49742b);
        f0.l(parcel, 3, this.f49743c);
        f0.r(parcel, q6);
    }
}
