package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44326a;
    public final String f44327b;
    public final boolean f44328c;
    public final int d;
    public final boolean f44329e;
    public final String f44330f;
    public final h[] h;
    public final String f44331n;
    public final m f44332r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44326a = str;
        this.f44327b = str2;
        this.f44328c = z10;
        this.d = i10;
        this.f44329e = z11;
        this.f44330f = str3;
        this.h = hVarArr;
        this.f44331n = str4;
        this.f44332r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44328c == lVar.f44328c && this.d == lVar.d && this.f44329e == lVar.f44329e && n6.l.l(this.f44326a, lVar.f44326a) && n6.l.l(this.f44327b, lVar.f44327b) && n6.l.l(this.f44330f, lVar.f44330f) && n6.l.l(this.f44331n, lVar.f44331n) && n6.l.l(this.f44332r, lVar.f44332r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44326a, this.f44327b, Boolean.valueOf(this.f44328c), Integer.valueOf(this.d), Boolean.valueOf(this.f44329e), this.f44330f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44331n, this.f44332r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44326a);
        g0.l(parcel, 2, this.f44327b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44328c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f44329e ? 1 : 0);
        g0.l(parcel, 6, this.f44330f);
        g0.o(parcel, 7, this.h, i10);
        g0.l(parcel, 11, this.f44331n);
        g0.k(parcel, 12, this.f44332r, i10);
        g0.r(parcel, q6);
    }
}
