package x5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(29);
    public final boolean f45612a;
    public final byte[] f45613b;
    public final String f45614c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45612a = z10;
        this.f45613b = bArr;
        this.f45614c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45612a == cVar.f45612a && Arrays.equals(this.f45613b, cVar.f45613b) && Objects.equals(this.f45614c, cVar.f45614c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45613b) + (Objects.hash(Boolean.valueOf(this.f45612a), this.f45614c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45612a ? 1 : 0);
        f0.c(parcel, 2, this.f45613b);
        f0.l(parcel, 3, this.f45614c);
        f0.r(parcel, q6);
    }
}
