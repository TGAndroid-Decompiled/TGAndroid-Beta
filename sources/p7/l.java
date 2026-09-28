package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40980a;
    public final String f40981b;
    public final boolean f40982c;
    public final int d;
    public final boolean e;
    public final String f40983f;
    public final h[] h;
    public final String f40984n;
    public final m f40985r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40980a = str;
        this.f40981b = str2;
        this.f40982c = z10;
        this.d = i10;
        this.e = z11;
        this.f40983f = str3;
        this.h = hVarArr;
        this.f40984n = str4;
        this.f40985r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40982c == lVar.f40982c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40980a, lVar.f40980a) && n6.l.l(this.f40981b, lVar.f40981b) && n6.l.l(this.f40983f, lVar.f40983f) && n6.l.l(this.f40984n, lVar.f40984n) && n6.l.l(this.f40985r, lVar.f40985r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40980a, this.f40981b, Boolean.valueOf(this.f40982c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40983f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40984n, this.f40985r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40980a);
        f0.l(parcel, 2, this.f40981b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40982c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40983f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40984n);
        f0.k(parcel, 12, this.f40985r, i10);
        f0.r(parcel, q6);
    }
}
