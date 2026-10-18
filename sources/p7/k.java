package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44296a;
    public final String f44297b;
    public final boolean f44298c;
    public final int d;
    public final boolean e;
    public final String f44299f;
    public final h[] h;
    public final String f44300n;
    public final l f44301r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44296a = str;
        this.f44297b = str2;
        this.f44298c = z10;
        this.d = i10;
        this.e = z11;
        this.f44299f = str3;
        this.h = hVarArr;
        this.f44300n = str4;
        this.f44301r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44298c == kVar.f44298c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44296a, kVar.f44296a) && n6.l.l(this.f44297b, kVar.f44297b) && n6.l.l(this.f44299f, kVar.f44299f) && n6.l.l(this.f44300n, kVar.f44300n) && n6.l.l(this.f44301r, kVar.f44301r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44296a, this.f44297b, Boolean.valueOf(this.f44298c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44299f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44300n, this.f44301r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44296a);
        f0.l(parcel, 2, this.f44297b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44298c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44299f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44300n);
        f0.k(parcel, 12, this.f44301r, i10);
        f0.r(parcel, q6);
    }
}
