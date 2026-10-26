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
    public final boolean f52048a;
    public final byte[] f52049b;
    public final String f52050c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f52048a = z10;
        this.f52049b = bArr;
        this.f52050c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f52048a == cVar.f52048a && Arrays.equals(this.f52049b, cVar.f52049b) && Objects.equals(this.f52050c, cVar.f52050c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f52049b) + (Objects.hash(Boolean.valueOf(this.f52048a), this.f52050c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52048a ? 1 : 0);
        df.c(parcel, 2, this.f52049b);
        df.l(parcel, 3, this.f52050c);
        df.r(parcel, q5);
    }
}
