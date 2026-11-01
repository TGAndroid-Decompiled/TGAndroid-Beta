package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.i(28);
    public final String f44879a;
    public final String f44880b;
    public final boolean f44881c;
    public final int d;
    public final boolean e;
    public final String f44882f;
    public final h[] h;
    public final String f44883n;
    public final l f44884r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44879a = str;
        this.f44880b = str2;
        this.f44881c = z10;
        this.d = i10;
        this.e = z11;
        this.f44882f = str3;
        this.h = hVarArr;
        this.f44883n = str4;
        this.f44884r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44881c == kVar.f44881c && this.d == kVar.d && this.e == kVar.e && n6.l.k(this.f44879a, kVar.f44879a) && n6.l.k(this.f44880b, kVar.f44880b) && n6.l.k(this.f44882f, kVar.f44882f) && n6.l.k(this.f44883n, kVar.f44883n) && n6.l.k(this.f44884r, kVar.f44884r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44879a, this.f44880b, Boolean.valueOf(this.f44881c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44882f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44883n, this.f44884r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f44879a);
        h0.l(parcel, 2, this.f44880b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f44881c ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.l(parcel, 6, this.f44882f);
        h0.o(parcel, 7, this.h, i10);
        h0.l(parcel, 11, this.f44883n);
        h0.k(parcel, 12, this.f44884r, i10);
        h0.r(parcel, q6);
    }
}
