package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40708a;
    public final String f40709b;
    public final boolean f40710c;
    public final int d;
    public final boolean e;
    public final String f40711f;
    public final h[] h;
    public final String f40712n;
    public final m f40713r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40708a = str;
        this.f40709b = str2;
        this.f40710c = z10;
        this.d = i10;
        this.e = z11;
        this.f40711f = str3;
        this.h = hVarArr;
        this.f40712n = str4;
        this.f40713r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40710c == lVar.f40710c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40708a, lVar.f40708a) && n6.l.l(this.f40709b, lVar.f40709b) && n6.l.l(this.f40711f, lVar.f40711f) && n6.l.l(this.f40712n, lVar.f40712n) && n6.l.l(this.f40713r, lVar.f40713r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40708a, this.f40709b, Boolean.valueOf(this.f40710c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40711f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40712n, this.f40713r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40708a);
        e0.l(parcel, 2, this.f40709b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40710c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f40711f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f40712n);
        e0.k(parcel, 12, this.f40713r, i10);
        e0.r(parcel, q6);
    }
}
