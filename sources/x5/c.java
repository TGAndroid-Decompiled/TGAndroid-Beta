package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f50790a;
    public final byte[] f50791b;
    public final String f50792c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.h(bArr);
            m.h(str);
        }
        this.f50790a = z10;
        this.f50791b = bArr;
        this.f50792c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f50790a == cVar.f50790a && Arrays.equals(this.f50791b, cVar.f50791b) && Objects.equals(this.f50792c, cVar.f50792c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50791b) + (Objects.hash(Boolean.valueOf(this.f50790a), this.f50792c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50790a ? 1 : 0);
        d0.c(parcel, 2, this.f50791b);
        d0.l(parcel, 3, this.f50792c);
        d0.r(parcel, q6);
    }
}
