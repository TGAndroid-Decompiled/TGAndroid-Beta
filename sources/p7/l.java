package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44004a;
    public final String f44005b;
    public final boolean f44006c;
    public final int d;
    public final boolean f44007e;
    public final String f44008f;
    public final h[] h;
    public final String f44009n;
    public final m f44010r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44004a = str;
        this.f44005b = str2;
        this.f44006c = z10;
        this.d = i10;
        this.f44007e = z11;
        this.f44008f = str3;
        this.h = hVarArr;
        this.f44009n = str4;
        this.f44010r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44006c == lVar.f44006c && this.d == lVar.d && this.f44007e == lVar.f44007e && n6.l.l(this.f44004a, lVar.f44004a) && n6.l.l(this.f44005b, lVar.f44005b) && n6.l.l(this.f44008f, lVar.f44008f) && n6.l.l(this.f44009n, lVar.f44009n) && n6.l.l(this.f44010r, lVar.f44010r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44004a, this.f44005b, Boolean.valueOf(this.f44006c), Integer.valueOf(this.d), Boolean.valueOf(this.f44007e), this.f44008f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44009n, this.f44010r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f44004a);
        e0.l(parcel, 2, this.f44005b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f44006c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f44007e ? 1 : 0);
        e0.l(parcel, 6, this.f44008f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f44009n);
        e0.k(parcel, 12, this.f44010r, i10);
        e0.r(parcel, q6);
    }
}
