package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f42866a;
    public final String f42867b;
    public final boolean f42868c;
    public final int d;
    public final boolean e;
    public final String f42869f;
    public final h[] h;
    public final String f42870n;
    public final l f42871r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f42866a = str;
        this.f42867b = str2;
        this.f42868c = z10;
        this.d = i10;
        this.e = z11;
        this.f42869f = str3;
        this.h = hVarArr;
        this.f42870n = str4;
        this.f42871r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f42868c == kVar.f42868c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f42866a, kVar.f42866a) && n6.l.l(this.f42867b, kVar.f42867b) && n6.l.l(this.f42869f, kVar.f42869f) && n6.l.l(this.f42870n, kVar.f42870n) && n6.l.l(this.f42871r, kVar.f42871r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42866a, this.f42867b, Boolean.valueOf(this.f42868c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f42869f, Integer.valueOf(Arrays.hashCode(this.h)), this.f42870n, this.f42871r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f42866a);
        f0.l(parcel, 2, this.f42867b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f42868c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f42869f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f42870n);
        f0.k(parcel, 12, this.f42871r, i10);
        f0.r(parcel, q6);
    }
}
