package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40712a;
    public final String f40713b;
    public final boolean f40714c;
    public final int d;
    public final boolean e;
    public final String f40715f;
    public final h[] h;
    public final String f40716n;
    public final m f40717r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40712a = str;
        this.f40713b = str2;
        this.f40714c = z10;
        this.d = i10;
        this.e = z11;
        this.f40715f = str3;
        this.h = hVarArr;
        this.f40716n = str4;
        this.f40717r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40714c == lVar.f40714c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40712a, lVar.f40712a) && n6.l.l(this.f40713b, lVar.f40713b) && n6.l.l(this.f40715f, lVar.f40715f) && n6.l.l(this.f40716n, lVar.f40716n) && n6.l.l(this.f40717r, lVar.f40717r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40712a, this.f40713b, Boolean.valueOf(this.f40714c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40715f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40716n, this.f40717r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40712a);
        e0.l(parcel, 2, this.f40713b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40714c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f40715f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f40716n);
        e0.k(parcel, 12, this.f40717r, i10);
        e0.r(parcel, q6);
    }
}
