package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45499a;
    public final String f45500b;
    public final boolean f45501c;
    public final int d;
    public final boolean f45502e;
    public final String f45503f;
    public final h[] h;
    public final String f45504n;
    public final m f45505r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45499a = str;
        this.f45500b = str2;
        this.f45501c = z10;
        this.d = i10;
        this.f45502e = z11;
        this.f45503f = str3;
        this.h = hVarArr;
        this.f45504n = str4;
        this.f45505r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45501c == lVar.f45501c && this.d == lVar.d && this.f45502e == lVar.f45502e && n6.l.l(this.f45499a, lVar.f45499a) && n6.l.l(this.f45500b, lVar.f45500b) && n6.l.l(this.f45503f, lVar.f45503f) && n6.l.l(this.f45504n, lVar.f45504n) && n6.l.l(this.f45505r, lVar.f45505r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45499a, this.f45500b, Boolean.valueOf(this.f45501c), Integer.valueOf(this.d), Boolean.valueOf(this.f45502e), this.f45503f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45504n, this.f45505r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45499a);
        d0.l(parcel, 2, this.f45500b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45501c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f45502e ? 1 : 0);
        d0.l(parcel, 6, this.f45503f);
        d0.o(parcel, 7, this.h, i10);
        d0.l(parcel, 11, this.f45504n);
        d0.k(parcel, 12, this.f45505r, i10);
        d0.r(parcel, q6);
    }
}
