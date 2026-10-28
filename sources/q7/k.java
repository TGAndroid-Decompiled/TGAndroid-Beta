package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(29);
    public final String f47035a;
    public final String f47036b;
    public final boolean f47037c;
    public final int d;
    public final boolean e;
    public final String f47038f;
    public final h[] h;
    public final String f47039n;
    public final l f47040r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f47035a = str;
        this.f47036b = str2;
        this.f47037c = z10;
        this.d = i10;
        this.e = z11;
        this.f47038f = str3;
        this.h = hVarArr;
        this.f47039n = str4;
        this.f47040r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f47037c == kVar.f47037c && this.d == kVar.d && this.e == kVar.e && o6.l.l(this.f47035a, kVar.f47035a) && o6.l.l(this.f47036b, kVar.f47036b) && o6.l.l(this.f47038f, kVar.f47038f) && o6.l.l(this.f47039n, kVar.f47039n) && o6.l.l(this.f47040r, kVar.f47040r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47035a, this.f47036b, Boolean.valueOf(this.f47037c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f47038f, Integer.valueOf(Arrays.hashCode(this.h)), this.f47039n, this.f47040r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f47035a);
        df.l(parcel, 2, this.f47036b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f47037c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.l(parcel, 6, this.f47038f);
        df.o(parcel, 7, this.h, i10);
        df.l(parcel, 11, this.f47039n);
        df.k(parcel, 12, this.f47040r, i10);
        df.r(parcel, q5);
    }
}
