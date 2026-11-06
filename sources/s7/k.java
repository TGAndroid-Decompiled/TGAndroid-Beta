package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54861a;
    public final String f54862b;
    public final boolean f54863c;
    public final int d;
    public final boolean f54864e;
    public final String f54865f;
    public final h[] h;
    public final String f54866n;
    public final l f54867r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54861a = str;
        this.f54862b = str2;
        this.f54863c = z9;
        this.d = i7;
        this.f54864e = z10;
        this.f54865f = str3;
        this.h = hVarArr;
        this.f54866n = str4;
        this.f54867r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54863c == kVar.f54863c && this.d == kVar.d && this.f54864e == kVar.f54864e && q6.m.k(this.f54861a, kVar.f54861a) && q6.m.k(this.f54862b, kVar.f54862b) && q6.m.k(this.f54865f, kVar.f54865f) && q6.m.k(this.f54866n, kVar.f54866n) && q6.m.k(this.f54867r, kVar.f54867r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54861a, this.f54862b, Boolean.valueOf(this.f54863c), Integer.valueOf(this.d), Boolean.valueOf(this.f54864e), this.f54865f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54866n, this.f54867r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54861a);
        xb.l(parcel, 2, this.f54862b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54863c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f54864e ? 1 : 0);
        xb.l(parcel, 6, this.f54865f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.f54866n);
        xb.k(parcel, 12, this.f54867r, i7);
        xb.s(parcel, r10);
    }
}
