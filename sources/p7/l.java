package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40978a;
    public final String f40979b;
    public final boolean f40980c;
    public final int d;
    public final boolean e;
    public final String f40981f;
    public final h[] h;
    public final String f40982n;
    public final m f40983r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40978a = str;
        this.f40979b = str2;
        this.f40980c = z10;
        this.d = i10;
        this.e = z11;
        this.f40981f = str3;
        this.h = hVarArr;
        this.f40982n = str4;
        this.f40983r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40980c == lVar.f40980c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40978a, lVar.f40978a) && n6.l.l(this.f40979b, lVar.f40979b) && n6.l.l(this.f40981f, lVar.f40981f) && n6.l.l(this.f40982n, lVar.f40982n) && n6.l.l(this.f40983r, lVar.f40983r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40978a, this.f40979b, Boolean.valueOf(this.f40980c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40981f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40982n, this.f40983r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40978a);
        f0.l(parcel, 2, this.f40979b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40980c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40981f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40982n);
        f0.k(parcel, 12, this.f40983r, i10);
        f0.r(parcel, q6);
    }
}
