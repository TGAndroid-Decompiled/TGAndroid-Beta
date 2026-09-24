package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40965a;
    public final String f40966b;
    public final boolean f40967c;
    public final int d;
    public final boolean e;
    public final String f40968f;
    public final h[] h;
    public final String f40969n;
    public final m f40970r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40965a = str;
        this.f40966b = str2;
        this.f40967c = z10;
        this.d = i10;
        this.e = z11;
        this.f40968f = str3;
        this.h = hVarArr;
        this.f40969n = str4;
        this.f40970r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40967c == lVar.f40967c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40965a, lVar.f40965a) && n6.l.l(this.f40966b, lVar.f40966b) && n6.l.l(this.f40968f, lVar.f40968f) && n6.l.l(this.f40969n, lVar.f40969n) && n6.l.l(this.f40970r, lVar.f40970r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40965a, this.f40966b, Boolean.valueOf(this.f40967c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40968f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40969n, this.f40970r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40965a);
        f0.l(parcel, 2, this.f40966b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40967c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40968f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40969n);
        f0.k(parcel, 12, this.f40970r, i10);
        f0.r(parcel, q6);
    }
}
