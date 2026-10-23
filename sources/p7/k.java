package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44675a;
    public final String f44676b;
    public final boolean f44677c;
    public final int d;
    public final boolean e;
    public final String f44678f;
    public final h[] h;
    public final String f44679n;
    public final l f44680r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44675a = str;
        this.f44676b = str2;
        this.f44677c = z10;
        this.d = i10;
        this.e = z11;
        this.f44678f = str3;
        this.h = hVarArr;
        this.f44679n = str4;
        this.f44680r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44677c == kVar.f44677c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44675a, kVar.f44675a) && n6.l.l(this.f44676b, kVar.f44676b) && n6.l.l(this.f44678f, kVar.f44678f) && n6.l.l(this.f44679n, kVar.f44679n) && n6.l.l(this.f44680r, kVar.f44680r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44675a, this.f44676b, Boolean.valueOf(this.f44677c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44678f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44679n, this.f44680r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44675a);
        f0.l(parcel, 2, this.f44676b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44677c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44678f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44679n);
        f0.k(parcel, 12, this.f44680r, i10);
        f0.r(parcel, q6);
    }
}
