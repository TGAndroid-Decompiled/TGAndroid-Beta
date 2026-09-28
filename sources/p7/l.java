package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40979a;
    public final String f40980b;
    public final boolean f40981c;
    public final int d;
    public final boolean e;
    public final String f40982f;
    public final h[] h;
    public final String f40983n;
    public final m f40984r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40979a = str;
        this.f40980b = str2;
        this.f40981c = z10;
        this.d = i10;
        this.e = z11;
        this.f40982f = str3;
        this.h = hVarArr;
        this.f40983n = str4;
        this.f40984r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40981c == lVar.f40981c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40979a, lVar.f40979a) && n6.l.l(this.f40980b, lVar.f40980b) && n6.l.l(this.f40982f, lVar.f40982f) && n6.l.l(this.f40983n, lVar.f40983n) && n6.l.l(this.f40984r, lVar.f40984r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40979a, this.f40980b, Boolean.valueOf(this.f40981c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40982f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40983n, this.f40984r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40979a);
        f0.l(parcel, 2, this.f40980b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40981c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40982f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40983n);
        f0.k(parcel, 12, this.f40984r, i10);
        f0.r(parcel, q6);
    }
}
