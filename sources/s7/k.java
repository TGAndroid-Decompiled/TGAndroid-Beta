package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f57140a;
    public final String f57141b;
    public final boolean f57142c;
    public final int d;
    public final boolean f57143e;
    public final String f57144f;
    public final h[] h;
    public final String f57145n;
    public final l f57146r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f57140a = str;
        this.f57141b = str2;
        this.f57142c = z10;
        this.d = i7;
        this.f57143e = z11;
        this.f57144f = str3;
        this.h = hVarArr;
        this.f57145n = str4;
        this.f57146r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f57142c == kVar.f57142c && this.d == kVar.d && this.f57143e == kVar.f57143e && q6.m.l(this.f57140a, kVar.f57140a) && q6.m.l(this.f57141b, kVar.f57141b) && q6.m.l(this.f57144f, kVar.f57144f) && q6.m.l(this.f57145n, kVar.f57145n) && q6.m.l(this.f57146r, kVar.f57146r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57140a, this.f57141b, Boolean.valueOf(this.f57142c), Integer.valueOf(this.d), Boolean.valueOf(this.f57143e), this.f57144f, Integer.valueOf(Arrays.hashCode(this.h)), this.f57145n, this.f57146r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57140a);
        bc.l(parcel, 2, this.f57141b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57142c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f57143e ? 1 : 0);
        bc.l(parcel, 6, this.f57144f);
        bc.o(parcel, 7, this.h, i7);
        bc.l(parcel, 11, this.f57145n);
        bc.k(parcel, 12, this.f57146r, i7);
        bc.s(parcel, r10);
    }
}
