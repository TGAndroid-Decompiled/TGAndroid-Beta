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
    public final boolean f45282a;
    public final byte[] f45283b;
    public final String f45284c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45282a = z10;
        this.f45283b = bArr;
        this.f45284c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45282a == cVar.f45282a && Arrays.equals(this.f45283b, cVar.f45283b) && Objects.equals(this.f45284c, cVar.f45284c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45283b) + (Objects.hash(Boolean.valueOf(this.f45282a), this.f45284c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f45282a ? 1 : 0);
        e0.c(parcel, 2, this.f45283b);
        e0.l(parcel, 3, this.f45284c);
        e0.r(parcel, q6);
    }
}
