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
    public final boolean f49288a;
    public final byte[] f49289b;
    public final String f49290c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f49288a = z10;
        this.f49289b = bArr;
        this.f49290c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f49288a == cVar.f49288a && Arrays.equals(this.f49289b, cVar.f49289b) && Objects.equals(this.f49290c, cVar.f49290c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49289b) + (Objects.hash(Boolean.valueOf(this.f49288a), this.f49290c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49288a ? 1 : 0);
        f0.c(parcel, 2, this.f49289b);
        f0.l(parcel, 3, this.f49290c);
        f0.r(parcel, q6);
    }
}
