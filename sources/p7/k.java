package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f43165a;
    public final String f43166b;
    public final boolean f43167c;
    public final int d;
    public final boolean e;
    public final String f43168f;
    public final h[] h;
    public final String f43169n;
    public final l f43170r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f43165a = str;
        this.f43166b = str2;
        this.f43167c = z10;
        this.d = i10;
        this.e = z11;
        this.f43168f = str3;
        this.h = hVarArr;
        this.f43169n = str4;
        this.f43170r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f43167c == kVar.f43167c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f43165a, kVar.f43165a) && n6.l.l(this.f43166b, kVar.f43166b) && n6.l.l(this.f43168f, kVar.f43168f) && n6.l.l(this.f43169n, kVar.f43169n) && n6.l.l(this.f43170r, kVar.f43170r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43165a, this.f43166b, Boolean.valueOf(this.f43167c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f43168f, Integer.valueOf(Arrays.hashCode(this.h)), this.f43169n, this.f43170r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f43165a);
        g0.l(parcel, 2, this.f43166b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f43167c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        g0.l(parcel, 6, this.f43168f);
        g0.o(parcel, 7, this.h, i10);
        g0.l(parcel, 11, this.f43169n);
        g0.k(parcel, 12, this.f43170r, i10);
        g0.r(parcel, q6);
    }
}
