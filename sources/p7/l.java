package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40663a;
    public final String f40664b;
    public final boolean f40665c;
    public final int d;
    public final boolean e;
    public final String f40666f;
    public final h[] h;
    public final String f40667n;
    public final m f40668r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40663a = str;
        this.f40664b = str2;
        this.f40665c = z10;
        this.d = i10;
        this.e = z11;
        this.f40666f = str3;
        this.h = hVarArr;
        this.f40667n = str4;
        this.f40668r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40665c == lVar.f40665c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40663a, lVar.f40663a) && n6.l.l(this.f40664b, lVar.f40664b) && n6.l.l(this.f40666f, lVar.f40666f) && n6.l.l(this.f40667n, lVar.f40667n) && n6.l.l(this.f40668r, lVar.f40668r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40663a, this.f40664b, Boolean.valueOf(this.f40665c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40666f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40667n, this.f40668r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40663a);
        e0.l(parcel, 2, this.f40664b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40665c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f40666f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f40667n);
        e0.k(parcel, 12, this.f40668r, i10);
        e0.r(parcel, q6);
    }
}
