package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new q8.i(6);
    public final String f54421a;
    public final String f54422b;
    public final boolean f54423c;
    public final int d;
    public final boolean f54424e;
    public final String f54425f;
    public final h[] h;
    public final String f54426n;
    public final l f54427r;

    public k(String str, String str2, boolean z10, int i3, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54421a = str;
        this.f54422b = str2;
        this.f54423c = z10;
        this.d = i3;
        this.f54424e = z11;
        this.f54425f = str3;
        this.h = hVarArr;
        this.f54426n = str4;
        this.f54427r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54423c == kVar.f54423c && this.d == kVar.d && this.f54424e == kVar.f54424e && p6.m.k(this.f54421a, kVar.f54421a) && p6.m.k(this.f54422b, kVar.f54422b) && p6.m.k(this.f54425f, kVar.f54425f) && p6.m.k(this.f54426n, kVar.f54426n) && p6.m.k(this.f54427r, kVar.f54427r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54421a, this.f54422b, Boolean.valueOf(this.f54423c), Integer.valueOf(this.d), Boolean.valueOf(this.f54424e), this.f54425f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54426n, this.f54427r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f54421a);
        j8.a.m(parcel, 2, this.f54422b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f54423c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f54424e ? 1 : 0);
        j8.a.m(parcel, 6, this.f54425f);
        j8.a.p(parcel, 7, this.h, i3);
        j8.a.m(parcel, 11, this.f54426n);
        j8.a.l(parcel, 12, this.f54427r, i3);
        j8.a.t(parcel, s6);
    }
}
