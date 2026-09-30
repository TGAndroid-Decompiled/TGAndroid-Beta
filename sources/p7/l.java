package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40981a;
    public final String f40982b;
    public final boolean f40983c;
    public final int d;
    public final boolean e;
    public final String f40984f;
    public final h[] h;
    public final String f40985n;
    public final m f40986r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40981a = str;
        this.f40982b = str2;
        this.f40983c = z10;
        this.d = i10;
        this.e = z11;
        this.f40984f = str3;
        this.h = hVarArr;
        this.f40985n = str4;
        this.f40986r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40983c == lVar.f40983c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40981a, lVar.f40981a) && n6.l.l(this.f40982b, lVar.f40982b) && n6.l.l(this.f40984f, lVar.f40984f) && n6.l.l(this.f40985n, lVar.f40985n) && n6.l.l(this.f40986r, lVar.f40986r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40981a, this.f40982b, Boolean.valueOf(this.f40983c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40984f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40985n, this.f40986r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40981a);
        f0.l(parcel, 2, this.f40982b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40983c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40984f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40985n);
        f0.k(parcel, 12, this.f40986r, i10);
        f0.r(parcel, q6);
    }
}
