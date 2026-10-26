package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(29);
    public final String f47000a;
    public final String f47001b;
    public final boolean f47002c;
    public final int d;
    public final boolean e;
    public final String f47003f;
    public final h[] h;
    public final String f47004n;
    public final l f47005r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f47000a = str;
        this.f47001b = str2;
        this.f47002c = z10;
        this.d = i10;
        this.e = z11;
        this.f47003f = str3;
        this.h = hVarArr;
        this.f47004n = str4;
        this.f47005r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f47002c == kVar.f47002c && this.d == kVar.d && this.e == kVar.e && o6.l.l(this.f47000a, kVar.f47000a) && o6.l.l(this.f47001b, kVar.f47001b) && o6.l.l(this.f47003f, kVar.f47003f) && o6.l.l(this.f47004n, kVar.f47004n) && o6.l.l(this.f47005r, kVar.f47005r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47000a, this.f47001b, Boolean.valueOf(this.f47002c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f47003f, Integer.valueOf(Arrays.hashCode(this.h)), this.f47004n, this.f47005r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f47000a);
        df.l(parcel, 2, this.f47001b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f47002c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.l(parcel, 6, this.f47003f);
        df.o(parcel, 7, this.h, i10);
        df.l(parcel, 11, this.f47004n);
        df.k(parcel, 12, this.f47005r, i10);
        df.r(parcel, q5);
    }
}
