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
    public final boolean f45328a;
    public final byte[] f45329b;
    public final String f45330c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45328a = z10;
        this.f45329b = bArr;
        this.f45330c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45328a == cVar.f45328a && Arrays.equals(this.f45329b, cVar.f45329b) && Objects.equals(this.f45330c, cVar.f45330c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45329b) + (Objects.hash(Boolean.valueOf(this.f45328a), this.f45330c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f45328a ? 1 : 0);
        e0.c(parcel, 2, this.f45329b);
        e0.l(parcel, 3, this.f45330c);
        e0.r(parcel, q6);
    }
}
