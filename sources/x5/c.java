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
    public final boolean f45355a;
    public final byte[] f45356b;
    public final String f45357c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f45355a = z10;
        this.f45356b = bArr;
        this.f45357c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45355a == cVar.f45355a && Arrays.equals(this.f45356b, cVar.f45356b) && Objects.equals(this.f45357c, cVar.f45357c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45356b) + (Objects.hash(Boolean.valueOf(this.f45355a), this.f45357c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f45355a ? 1 : 0);
        e0.c(parcel, 2, this.f45356b);
        e0.l(parcel, 3, this.f45357c);
        e0.r(parcel, q6);
    }
}
