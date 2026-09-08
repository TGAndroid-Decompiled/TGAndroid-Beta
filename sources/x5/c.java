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
    public final boolean f48924a;
    public final byte[] f48925b;
    public final String f48926c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f48924a = z10;
        this.f48925b = bArr;
        this.f48926c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f48924a == cVar.f48924a && Arrays.equals(this.f48925b, cVar.f48925b) && Objects.equals(this.f48926c, cVar.f48926c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48925b) + (Objects.hash(Boolean.valueOf(this.f48924a), this.f48926c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f48924a ? 1 : 0);
        e0.c(parcel, 2, this.f48925b);
        e0.l(parcel, 3, this.f48926c);
        e0.r(parcel, q6);
    }
}
