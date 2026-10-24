package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44674a;
    public final String f44675b;
    public final boolean f44676c;
    public final int d;
    public final boolean e;
    public final String f44677f;
    public final h[] h;
    public final String f44678n;
    public final l f44679r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44674a = str;
        this.f44675b = str2;
        this.f44676c = z10;
        this.d = i10;
        this.e = z11;
        this.f44677f = str3;
        this.h = hVarArr;
        this.f44678n = str4;
        this.f44679r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44676c == kVar.f44676c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44674a, kVar.f44674a) && n6.l.l(this.f44675b, kVar.f44675b) && n6.l.l(this.f44677f, kVar.f44677f) && n6.l.l(this.f44678n, kVar.f44678n) && n6.l.l(this.f44679r, kVar.f44679r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44674a, this.f44675b, Boolean.valueOf(this.f44676c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44677f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44678n, this.f44679r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44674a);
        f0.l(parcel, 2, this.f44675b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44676c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44677f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44678n);
        f0.k(parcel, 12, this.f44679r, i10);
        f0.r(parcel, q6);
    }
}
