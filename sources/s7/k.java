package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f57219a;
    public final String f57220b;
    public final boolean f57221c;
    public final int d;
    public final boolean f57222e;
    public final String f57223f;
    public final h[] h;
    public final String f57224n;
    public final l f57225r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f57219a = str;
        this.f57220b = str2;
        this.f57221c = z10;
        this.d = i7;
        this.f57222e = z11;
        this.f57223f = str3;
        this.h = hVarArr;
        this.f57224n = str4;
        this.f57225r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f57221c == kVar.f57221c && this.d == kVar.d && this.f57222e == kVar.f57222e && q6.m.l(this.f57219a, kVar.f57219a) && q6.m.l(this.f57220b, kVar.f57220b) && q6.m.l(this.f57223f, kVar.f57223f) && q6.m.l(this.f57224n, kVar.f57224n) && q6.m.l(this.f57225r, kVar.f57225r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57219a, this.f57220b, Boolean.valueOf(this.f57221c), Integer.valueOf(this.d), Boolean.valueOf(this.f57222e), this.f57223f, Integer.valueOf(Arrays.hashCode(this.h)), this.f57224n, this.f57225r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f57219a);
        cc.l(parcel, 2, this.f57220b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f57221c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f57222e ? 1 : 0);
        cc.l(parcel, 6, this.f57223f);
        cc.o(parcel, 7, this.h, i7);
        cc.l(parcel, 11, this.f57224n);
        cc.k(parcel, 12, this.f57225r, i7);
        cc.s(parcel, r10);
    }
}
