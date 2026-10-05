package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44333a;
    public final String f44334b;
    public final boolean f44335c;
    public final int d;
    public final boolean f44336e;
    public final String f44337f;
    public final h[] h;
    public final String f44338n;
    public final m f44339r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44333a = str;
        this.f44334b = str2;
        this.f44335c = z10;
        this.d = i10;
        this.f44336e = z11;
        this.f44337f = str3;
        this.h = hVarArr;
        this.f44338n = str4;
        this.f44339r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44335c == lVar.f44335c && this.d == lVar.d && this.f44336e == lVar.f44336e && n6.l.l(this.f44333a, lVar.f44333a) && n6.l.l(this.f44334b, lVar.f44334b) && n6.l.l(this.f44337f, lVar.f44337f) && n6.l.l(this.f44338n, lVar.f44338n) && n6.l.l(this.f44339r, lVar.f44339r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44333a, this.f44334b, Boolean.valueOf(this.f44335c), Integer.valueOf(this.d), Boolean.valueOf(this.f44336e), this.f44337f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44338n, this.f44339r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44333a);
        g0.l(parcel, 2, this.f44334b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44335c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f44336e ? 1 : 0);
        g0.l(parcel, 6, this.f44337f);
        g0.o(parcel, 7, this.h, i10);
        g0.l(parcel, 11, this.f44338n);
        g0.k(parcel, 12, this.f44339r, i10);
        g0.r(parcel, q6);
    }
}
