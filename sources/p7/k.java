package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.i(28);
    public final String f44868a;
    public final String f44869b;
    public final boolean f44870c;
    public final int d;
    public final boolean e;
    public final String f44871f;
    public final h[] h;
    public final String f44872n;
    public final l f44873r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44868a = str;
        this.f44869b = str2;
        this.f44870c = z10;
        this.d = i10;
        this.e = z11;
        this.f44871f = str3;
        this.h = hVarArr;
        this.f44872n = str4;
        this.f44873r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44870c == kVar.f44870c && this.d == kVar.d && this.e == kVar.e && n6.l.k(this.f44868a, kVar.f44868a) && n6.l.k(this.f44869b, kVar.f44869b) && n6.l.k(this.f44871f, kVar.f44871f) && n6.l.k(this.f44872n, kVar.f44872n) && n6.l.k(this.f44873r, kVar.f44873r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44868a, this.f44869b, Boolean.valueOf(this.f44870c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44871f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44872n, this.f44873r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f44868a);
        h0.l(parcel, 2, this.f44869b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f44870c ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.l(parcel, 6, this.f44871f);
        h0.o(parcel, 7, this.h, i10);
        h0.l(parcel, 11, this.f44872n);
        h0.k(parcel, 12, this.f44873r, i10);
        h0.r(parcel, q6);
    }
}
