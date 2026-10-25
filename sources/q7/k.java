package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(29);
    public final String f46997a;
    public final String f46998b;
    public final boolean f46999c;
    public final int d;
    public final boolean e;
    public final String f47000f;
    public final h[] h;
    public final String f47001n;
    public final l f47002r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f46997a = str;
        this.f46998b = str2;
        this.f46999c = z10;
        this.d = i10;
        this.e = z11;
        this.f47000f = str3;
        this.h = hVarArr;
        this.f47001n = str4;
        this.f47002r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f46999c == kVar.f46999c && this.d == kVar.d && this.e == kVar.e && o6.l.l(this.f46997a, kVar.f46997a) && o6.l.l(this.f46998b, kVar.f46998b) && o6.l.l(this.f47000f, kVar.f47000f) && o6.l.l(this.f47001n, kVar.f47001n) && o6.l.l(this.f47002r, kVar.f47002r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46997a, this.f46998b, Boolean.valueOf(this.f46999c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f47000f, Integer.valueOf(Arrays.hashCode(this.h)), this.f47001n, this.f47002r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f46997a);
        df.l(parcel, 2, this.f46998b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f46999c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.l(parcel, 6, this.f47000f);
        df.o(parcel, 7, this.h, i10);
        df.l(parcel, 11, this.f47001n);
        df.k(parcel, 12, this.f47002r, i10);
        df.r(parcel, q5);
    }
}
