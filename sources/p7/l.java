package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45390a;
    public final String f45391b;
    public final boolean f45392c;
    public final int d;
    public final boolean f45393e;
    public final String f45394f;
    public final h[] h;
    public final String f45395n;
    public final m f45396r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45390a = str;
        this.f45391b = str2;
        this.f45392c = z10;
        this.d = i10;
        this.f45393e = z11;
        this.f45394f = str3;
        this.h = hVarArr;
        this.f45395n = str4;
        this.f45396r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45392c == lVar.f45392c && this.d == lVar.d && this.f45393e == lVar.f45393e && n6.m.l(this.f45390a, lVar.f45390a) && n6.m.l(this.f45391b, lVar.f45391b) && n6.m.l(this.f45394f, lVar.f45394f) && n6.m.l(this.f45395n, lVar.f45395n) && n6.m.l(this.f45396r, lVar.f45396r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45390a, this.f45391b, Boolean.valueOf(this.f45392c), Integer.valueOf(this.d), Boolean.valueOf(this.f45393e), this.f45394f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45395n, this.f45396r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f45390a);
        c0.l(parcel, 2, this.f45391b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45392c ? 1 : 0);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f45393e ? 1 : 0);
        c0.l(parcel, 6, this.f45394f);
        c0.o(parcel, 7, this.h, i10);
        c0.l(parcel, 11, this.f45395n);
        c0.k(parcel, 12, this.f45396r, i10);
        c0.r(parcel, q6);
    }
}
