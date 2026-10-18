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
    public final boolean f49289a;
    public final byte[] f49290b;
    public final String f49291c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49289a = z10;
        this.f49290b = bArr;
        this.f49291c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49289a == cVar.f49289a && Arrays.equals(this.f49290b, cVar.f49290b) && Objects.equals(this.f49291c, cVar.f49291c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49290b) + (Objects.hash(Boolean.valueOf(this.f49289a), this.f49291c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49289a ? 1 : 0);
        f0.c(parcel, 2, this.f49290b);
        f0.l(parcel, 3, this.f49291c);
        f0.r(parcel, q6);
    }
}
