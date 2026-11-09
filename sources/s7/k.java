package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54966a;
    public final String f54967b;
    public final boolean f54968c;
    public final int d;
    public final boolean f54969e;
    public final String f54970f;
    public final h[] h;
    public final String f54971n;
    public final l f54972r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54966a = str;
        this.f54967b = str2;
        this.f54968c = z9;
        this.d = i7;
        this.f54969e = z10;
        this.f54970f = str3;
        this.h = hVarArr;
        this.f54971n = str4;
        this.f54972r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54968c == kVar.f54968c && this.d == kVar.d && this.f54969e == kVar.f54969e && q6.m.k(this.f54966a, kVar.f54966a) && q6.m.k(this.f54967b, kVar.f54967b) && q6.m.k(this.f54970f, kVar.f54970f) && q6.m.k(this.f54971n, kVar.f54971n) && q6.m.k(this.f54972r, kVar.f54972r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54966a, this.f54967b, Boolean.valueOf(this.f54968c), Integer.valueOf(this.d), Boolean.valueOf(this.f54969e), this.f54970f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54971n, this.f54972r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54966a);
        xb.l(parcel, 2, this.f54967b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54968c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f54969e ? 1 : 0);
        xb.l(parcel, 6, this.f54970f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.f54971n);
        xb.k(parcel, 12, this.f54972r, i7);
        xb.s(parcel, r10);
    }
}
