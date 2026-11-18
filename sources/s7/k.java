package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f57095a;
    public final String f57096b;
    public final boolean f57097c;
    public final int d;
    public final boolean f57098e;
    public final String f57099f;
    public final h[] h;
    public final String f57100n;
    public final l f57101r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f57095a = str;
        this.f57096b = str2;
        this.f57097c = z10;
        this.d = i7;
        this.f57098e = z11;
        this.f57099f = str3;
        this.h = hVarArr;
        this.f57100n = str4;
        this.f57101r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f57097c == kVar.f57097c && this.d == kVar.d && this.f57098e == kVar.f57098e && q6.m.l(this.f57095a, kVar.f57095a) && q6.m.l(this.f57096b, kVar.f57096b) && q6.m.l(this.f57099f, kVar.f57099f) && q6.m.l(this.f57100n, kVar.f57100n) && q6.m.l(this.f57101r, kVar.f57101r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57095a, this.f57096b, Boolean.valueOf(this.f57097c), Integer.valueOf(this.d), Boolean.valueOf(this.f57098e), this.f57099f, Integer.valueOf(Arrays.hashCode(this.h)), this.f57100n, this.f57101r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57095a);
        bc.l(parcel, 2, this.f57096b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57097c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f57098e ? 1 : 0);
        bc.l(parcel, 6, this.f57099f);
        bc.o(parcel, 7, this.h, i7);
        bc.l(parcel, 11, this.f57100n);
        bc.k(parcel, 12, this.f57101r, i7);
        bc.s(parcel, r10);
    }
}
