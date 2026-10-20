package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44256a;
    public final String f44257b;
    public final boolean f44258c;
    public final int d;
    public final boolean e;
    public final String f44259f;
    public final h[] h;
    public final String f44260n;
    public final l f44261r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44256a = str;
        this.f44257b = str2;
        this.f44258c = z10;
        this.d = i10;
        this.e = z11;
        this.f44259f = str3;
        this.h = hVarArr;
        this.f44260n = str4;
        this.f44261r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44258c == kVar.f44258c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44256a, kVar.f44256a) && n6.l.l(this.f44257b, kVar.f44257b) && n6.l.l(this.f44259f, kVar.f44259f) && n6.l.l(this.f44260n, kVar.f44260n) && n6.l.l(this.f44261r, kVar.f44261r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44256a, this.f44257b, Boolean.valueOf(this.f44258c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44259f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44260n, this.f44261r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44256a);
        f0.l(parcel, 2, this.f44257b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44258c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44259f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44260n);
        f0.k(parcel, 12, this.f44261r, i10);
        f0.r(parcel, q6);
    }
}
