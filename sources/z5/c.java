package z5;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import p6.m;
import y8.i;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new i(5);
    public final boolean f59772a;
    public final byte[] f59773b;
    public final String f59774c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            m.g(bArr);
            m.g(str);
        }
        this.f59772a = z10;
        this.f59773b = bArr;
        this.f59774c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f59772a == cVar.f59772a && Arrays.equals(this.f59773b, cVar.f59773b) && Objects.equals(this.f59774c, cVar.f59774c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59773b) + (Objects.hash(Boolean.valueOf(this.f59772a), this.f59774c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f59772a ? 1 : 0);
        j8.a.d(parcel, 2, this.f59773b);
        j8.a.m(parcel, 3, this.f59774c);
        j8.a.t(parcel, s6);
    }
}
