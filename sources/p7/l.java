package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45385a;
    public final String f45386b;
    public final boolean f45387c;
    public final int d;
    public final boolean f45388e;
    public final String f45389f;
    public final h[] h;
    public final String f45390n;
    public final m f45391r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45385a = str;
        this.f45386b = str2;
        this.f45387c = z10;
        this.d = i10;
        this.f45388e = z11;
        this.f45389f = str3;
        this.h = hVarArr;
        this.f45390n = str4;
        this.f45391r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45387c == lVar.f45387c && this.d == lVar.d && this.f45388e == lVar.f45388e && n6.m.l(this.f45385a, lVar.f45385a) && n6.m.l(this.f45386b, lVar.f45386b) && n6.m.l(this.f45389f, lVar.f45389f) && n6.m.l(this.f45390n, lVar.f45390n) && n6.m.l(this.f45391r, lVar.f45391r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45385a, this.f45386b, Boolean.valueOf(this.f45387c), Integer.valueOf(this.d), Boolean.valueOf(this.f45388e), this.f45389f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45390n, this.f45391r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f45385a);
        c0.l(parcel, 2, this.f45386b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45387c ? 1 : 0);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f45388e ? 1 : 0);
        c0.l(parcel, 6, this.f45389f);
        c0.o(parcel, 7, this.h, i10);
        c0.l(parcel, 11, this.f45390n);
        c0.k(parcel, 12, this.f45391r, i10);
        c0.r(parcel, q6);
    }
}
