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
    public final boolean f48925a;
    public final byte[] f48926b;
    public final String f48927c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f48925a = z10;
        this.f48926b = bArr;
        this.f48927c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f48925a == cVar.f48925a && Arrays.equals(this.f48926b, cVar.f48926b) && Objects.equals(this.f48927c, cVar.f48927c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48926b) + (Objects.hash(Boolean.valueOf(this.f48925a), this.f48927c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f48925a ? 1 : 0);
        e0.c(parcel, 2, this.f48926b);
        e0.l(parcel, 3, this.f48927c);
        e0.r(parcel, q6);
    }
}
