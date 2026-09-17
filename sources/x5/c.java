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
    public final boolean f48896a;
    public final byte[] f48897b;
    public final String f48898c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f48896a = z10;
        this.f48897b = bArr;
        this.f48898c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f48896a == cVar.f48896a && Arrays.equals(this.f48897b, cVar.f48897b) && Objects.equals(this.f48898c, cVar.f48898c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48897b) + (Objects.hash(Boolean.valueOf(this.f48896a), this.f48898c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f48896a ? 1 : 0);
        e0.c(parcel, 2, this.f48897b);
        e0.l(parcel, 3, this.f48898c);
        e0.r(parcel, q6);
    }
}
