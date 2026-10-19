package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44248a;
    public final String f44249b;
    public final boolean f44250c;
    public final int d;
    public final boolean e;
    public final String f44251f;
    public final h[] h;
    public final String f44252n;
    public final l f44253r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44248a = str;
        this.f44249b = str2;
        this.f44250c = z10;
        this.d = i10;
        this.e = z11;
        this.f44251f = str3;
        this.h = hVarArr;
        this.f44252n = str4;
        this.f44253r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44250c == kVar.f44250c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44248a, kVar.f44248a) && n6.l.l(this.f44249b, kVar.f44249b) && n6.l.l(this.f44251f, kVar.f44251f) && n6.l.l(this.f44252n, kVar.f44252n) && n6.l.l(this.f44253r, kVar.f44253r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44248a, this.f44249b, Boolean.valueOf(this.f44250c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44251f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44252n, this.f44253r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44248a);
        f0.l(parcel, 2, this.f44249b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44250c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44251f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44252n);
        f0.k(parcel, 12, this.f44253r, i10);
        f0.r(parcel, q6);
    }
}
