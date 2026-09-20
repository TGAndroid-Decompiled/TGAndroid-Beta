package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f41006a;
    public final String f41007b;
    public final boolean f41008c;
    public final int d;
    public final boolean e;
    public final String f41009f;
    public final h[] h;
    public final String f41010n;
    public final m f41011r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f41006a = str;
        this.f41007b = str2;
        this.f41008c = z10;
        this.d = i10;
        this.e = z11;
        this.f41009f = str3;
        this.h = hVarArr;
        this.f41010n = str4;
        this.f41011r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f41008c == lVar.f41008c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f41006a, lVar.f41006a) && n6.l.l(this.f41007b, lVar.f41007b) && n6.l.l(this.f41009f, lVar.f41009f) && n6.l.l(this.f41010n, lVar.f41010n) && n6.l.l(this.f41011r, lVar.f41011r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41006a, this.f41007b, Boolean.valueOf(this.f41008c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f41009f, Integer.valueOf(Arrays.hashCode(this.h)), this.f41010n, this.f41011r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f41006a);
        f0.l(parcel, 2, this.f41007b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f41008c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f41009f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f41010n);
        f0.k(parcel, 12, this.f41011r, i10);
        f0.r(parcel, q6);
    }
}
