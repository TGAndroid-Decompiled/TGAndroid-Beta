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
    public final boolean f44672a;
    public final byte[] f44673b;
    public final String f44674c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f44672a = z10;
        this.f44673b = bArr;
        this.f44674c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f44672a == cVar.f44672a && Arrays.equals(this.f44673b, cVar.f44673b) && Objects.equals(this.f44674c, cVar.f44674c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44673b) + (Objects.hash(Boolean.valueOf(this.f44672a), this.f44674c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44672a ? 1 : 0);
        e0.c(parcel, 2, this.f44673b);
        e0.l(parcel, 3, this.f44674c);
        e0.r(parcel, q6);
    }
}
