package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f41027a;
    public final String f41028b;
    public final boolean f41029c;
    public final int d;
    public final boolean e;
    public final String f41030f;
    public final h[] h;
    public final String f41031n;
    public final m f41032r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f41027a = str;
        this.f41028b = str2;
        this.f41029c = z10;
        this.d = i10;
        this.e = z11;
        this.f41030f = str3;
        this.h = hVarArr;
        this.f41031n = str4;
        this.f41032r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f41029c == lVar.f41029c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f41027a, lVar.f41027a) && n6.l.l(this.f41028b, lVar.f41028b) && n6.l.l(this.f41030f, lVar.f41030f) && n6.l.l(this.f41031n, lVar.f41031n) && n6.l.l(this.f41032r, lVar.f41032r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41027a, this.f41028b, Boolean.valueOf(this.f41029c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f41030f, Integer.valueOf(Arrays.hashCode(this.h)), this.f41031n, this.f41032r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f41027a);
        f0.l(parcel, 2, this.f41028b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f41029c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f41030f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f41031n);
        f0.k(parcel, 12, this.f41032r, i10);
        f0.r(parcel, q6);
    }
}
