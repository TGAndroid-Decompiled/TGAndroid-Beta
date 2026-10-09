package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45497a;
    public final String f45498b;
    public final boolean f45499c;
    public final int d;
    public final boolean f45500e;
    public final String f45501f;
    public final h[] h;
    public final String f45502n;
    public final m f45503r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45497a = str;
        this.f45498b = str2;
        this.f45499c = z10;
        this.d = i10;
        this.f45500e = z11;
        this.f45501f = str3;
        this.h = hVarArr;
        this.f45502n = str4;
        this.f45503r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45499c == lVar.f45499c && this.d == lVar.d && this.f45500e == lVar.f45500e && n6.l.l(this.f45497a, lVar.f45497a) && n6.l.l(this.f45498b, lVar.f45498b) && n6.l.l(this.f45501f, lVar.f45501f) && n6.l.l(this.f45502n, lVar.f45502n) && n6.l.l(this.f45503r, lVar.f45503r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45497a, this.f45498b, Boolean.valueOf(this.f45499c), Integer.valueOf(this.d), Boolean.valueOf(this.f45500e), this.f45501f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45502n, this.f45503r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45497a);
        d0.l(parcel, 2, this.f45498b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45499c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f45500e ? 1 : 0);
        d0.l(parcel, 6, this.f45501f);
        d0.o(parcel, 7, this.h, i10);
        d0.l(parcel, 11, this.f45502n);
        d0.k(parcel, 12, this.f45503r, i10);
        d0.r(parcel, q6);
    }
}
