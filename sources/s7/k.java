package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54965a;
    public final String f54966b;
    public final boolean f54967c;
    public final int d;
    public final boolean f54968e;
    public final String f54969f;
    public final h[] h;
    public final String f54970n;
    public final l f54971r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54965a = str;
        this.f54966b = str2;
        this.f54967c = z9;
        this.d = i7;
        this.f54968e = z10;
        this.f54969f = str3;
        this.h = hVarArr;
        this.f54970n = str4;
        this.f54971r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54967c == kVar.f54967c && this.d == kVar.d && this.f54968e == kVar.f54968e && q6.m.k(this.f54965a, kVar.f54965a) && q6.m.k(this.f54966b, kVar.f54966b) && q6.m.k(this.f54969f, kVar.f54969f) && q6.m.k(this.f54970n, kVar.f54970n) && q6.m.k(this.f54971r, kVar.f54971r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54965a, this.f54966b, Boolean.valueOf(this.f54967c), Integer.valueOf(this.d), Boolean.valueOf(this.f54968e), this.f54969f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54970n, this.f54971r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54965a);
        xb.l(parcel, 2, this.f54966b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54967c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f54968e ? 1 : 0);
        xb.l(parcel, 6, this.f54969f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.f54970n);
        xb.k(parcel, 12, this.f54971r, i7);
        xb.s(parcel, r10);
    }
}
