package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(27);
    public final boolean f52045a;
    public final byte[] f52046b;
    public final String f52047c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f52045a = z10;
        this.f52046b = bArr;
        this.f52047c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f52045a == cVar.f52045a && Arrays.equals(this.f52046b, cVar.f52046b) && Objects.equals(this.f52047c, cVar.f52047c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f52046b) + (Objects.hash(Boolean.valueOf(this.f52045a), this.f52047c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52045a ? 1 : 0);
        df.c(parcel, 2, this.f52046b);
        df.l(parcel, 3, this.f52047c);
        df.r(parcel, q5);
    }
}
