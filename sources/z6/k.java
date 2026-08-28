package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new w7.i(23);
    public final String f50328a;
    public final String f50329b;
    public final boolean f50330c;
    public final int d;
    public final boolean f50331e;
    public final String f50332f;
    public final h[] h;
    public final String f50333n;
    public final l f50334r;

    public k(String str, String str2, boolean z10, int i9, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f50328a = str;
        this.f50329b = str2;
        this.f50330c = z10;
        this.d = i9;
        this.f50331e = z11;
        this.f50332f = str3;
        this.h = hVarArr;
        this.f50333n = str4;
        this.f50334r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f50330c == kVar.f50330c && this.d == kVar.d && this.f50331e == kVar.f50331e && x5.l.l(this.f50328a, kVar.f50328a) && x5.l.l(this.f50329b, kVar.f50329b) && x5.l.l(this.f50332f, kVar.f50332f) && x5.l.l(this.f50333n, kVar.f50333n) && x5.l.l(this.f50334r, kVar.f50334r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50328a, this.f50329b, Boolean.valueOf(this.f50330c), Integer.valueOf(this.d), Boolean.valueOf(this.f50331e), this.f50332f, Integer.valueOf(Arrays.hashCode(this.h)), this.f50333n, this.f50334r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f50328a);
        p8.l(parcel, 2, this.f50329b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f50330c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f50331e ? 1 : 0);
        p8.l(parcel, 6, this.f50332f);
        p8.o(parcel, 7, this.h, i9);
        p8.l(parcel, 11, this.f50333n);
        p8.k(parcel, 12, this.f50334r, i9);
        p8.r(parcel, q10);
    }
}
