package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44251a;
    public final String f44252b;
    public final boolean f44253c;
    public final int d;
    public final boolean e;
    public final String f44254f;
    public final h[] h;
    public final String f44255n;
    public final l f44256r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44251a = str;
        this.f44252b = str2;
        this.f44253c = z10;
        this.d = i10;
        this.e = z11;
        this.f44254f = str3;
        this.h = hVarArr;
        this.f44255n = str4;
        this.f44256r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44253c == kVar.f44253c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44251a, kVar.f44251a) && n6.l.l(this.f44252b, kVar.f44252b) && n6.l.l(this.f44254f, kVar.f44254f) && n6.l.l(this.f44255n, kVar.f44255n) && n6.l.l(this.f44256r, kVar.f44256r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44251a, this.f44252b, Boolean.valueOf(this.f44253c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44254f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44255n, this.f44256r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44251a);
        f0.l(parcel, 2, this.f44252b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44253c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44254f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44255n);
        f0.k(parcel, 12, this.f44256r, i10);
        f0.r(parcel, q6);
    }
}
