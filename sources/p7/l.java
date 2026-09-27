package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40977a;
    public final String f40978b;
    public final boolean f40979c;
    public final int d;
    public final boolean e;
    public final String f40980f;
    public final h[] h;
    public final String f40981n;
    public final m f40982r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40977a = str;
        this.f40978b = str2;
        this.f40979c = z10;
        this.d = i10;
        this.e = z11;
        this.f40980f = str3;
        this.h = hVarArr;
        this.f40981n = str4;
        this.f40982r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40979c == lVar.f40979c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40977a, lVar.f40977a) && n6.l.l(this.f40978b, lVar.f40978b) && n6.l.l(this.f40980f, lVar.f40980f) && n6.l.l(this.f40981n, lVar.f40981n) && n6.l.l(this.f40982r, lVar.f40982r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40977a, this.f40978b, Boolean.valueOf(this.f40979c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40980f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40981n, this.f40982r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f40977a);
        f0.l(parcel, 2, this.f40978b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40979c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f40980f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f40981n);
        f0.k(parcel, 12, this.f40982r, i10);
        f0.r(parcel, q6);
    }
}
