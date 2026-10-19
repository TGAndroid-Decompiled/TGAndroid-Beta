package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44246a;
    public final String f44247b;
    public final boolean f44248c;
    public final int d;
    public final boolean e;
    public final String f44249f;
    public final h[] h;
    public final String f44250n;
    public final l f44251r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44246a = str;
        this.f44247b = str2;
        this.f44248c = z10;
        this.d = i10;
        this.e = z11;
        this.f44249f = str3;
        this.h = hVarArr;
        this.f44250n = str4;
        this.f44251r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44248c == kVar.f44248c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44246a, kVar.f44246a) && n6.l.l(this.f44247b, kVar.f44247b) && n6.l.l(this.f44249f, kVar.f44249f) && n6.l.l(this.f44250n, kVar.f44250n) && n6.l.l(this.f44251r, kVar.f44251r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44246a, this.f44247b, Boolean.valueOf(this.f44248c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44249f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44250n, this.f44251r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44246a);
        f0.l(parcel, 2, this.f44247b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44248c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44249f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44250n);
        f0.k(parcel, 12, this.f44251r, i10);
        f0.r(parcel, q6);
    }
}
