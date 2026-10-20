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
    public final boolean f49295a;
    public final byte[] f49296b;
    public final String f49297c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49295a = z10;
        this.f49296b = bArr;
        this.f49297c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49295a == cVar.f49295a && Arrays.equals(this.f49296b, cVar.f49296b) && Objects.equals(this.f49297c, cVar.f49297c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49296b) + (Objects.hash(Boolean.valueOf(this.f49295a), this.f49297c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49295a ? 1 : 0);
        f0.c(parcel, 2, this.f49296b);
        f0.l(parcel, 3, this.f49297c);
        f0.r(parcel, q6);
    }
}
