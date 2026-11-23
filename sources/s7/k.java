package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f57105a;
    public final String f57106b;
    public final boolean f57107c;
    public final int d;
    public final boolean f57108e;
    public final String f57109f;
    public final h[] h;
    public final String f57110n;
    public final l f57111r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f57105a = str;
        this.f57106b = str2;
        this.f57107c = z10;
        this.d = i7;
        this.f57108e = z11;
        this.f57109f = str3;
        this.h = hVarArr;
        this.f57110n = str4;
        this.f57111r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f57107c == kVar.f57107c && this.d == kVar.d && this.f57108e == kVar.f57108e && q6.m.l(this.f57105a, kVar.f57105a) && q6.m.l(this.f57106b, kVar.f57106b) && q6.m.l(this.f57109f, kVar.f57109f) && q6.m.l(this.f57110n, kVar.f57110n) && q6.m.l(this.f57111r, kVar.f57111r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57105a, this.f57106b, Boolean.valueOf(this.f57107c), Integer.valueOf(this.d), Boolean.valueOf(this.f57108e), this.f57109f, Integer.valueOf(Arrays.hashCode(this.h)), this.f57110n, this.f57111r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f57105a);
        cc.l(parcel, 2, this.f57106b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f57107c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f57108e ? 1 : 0);
        cc.l(parcel, 6, this.f57109f);
        cc.o(parcel, 7, this.h, i7);
        cc.l(parcel, 11, this.f57110n);
        cc.k(parcel, 12, this.f57111r, i7);
        cc.s(parcel, r10);
    }
}
