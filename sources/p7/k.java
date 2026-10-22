package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44259a;
    public final String f44260b;
    public final boolean f44261c;
    public final int d;
    public final boolean e;
    public final String f44262f;
    public final h[] h;
    public final String f44263n;
    public final l f44264r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44259a = str;
        this.f44260b = str2;
        this.f44261c = z10;
        this.d = i10;
        this.e = z11;
        this.f44262f = str3;
        this.h = hVarArr;
        this.f44263n = str4;
        this.f44264r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44261c == kVar.f44261c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44259a, kVar.f44259a) && n6.l.l(this.f44260b, kVar.f44260b) && n6.l.l(this.f44262f, kVar.f44262f) && n6.l.l(this.f44263n, kVar.f44263n) && n6.l.l(this.f44264r, kVar.f44264r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44259a, this.f44260b, Boolean.valueOf(this.f44261c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44262f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44263n, this.f44264r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44259a);
        f0.l(parcel, 2, this.f44260b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44261c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44262f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44263n);
        f0.k(parcel, 12, this.f44264r, i10);
        f0.r(parcel, q6);
    }
}
