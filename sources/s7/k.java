package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54837a;
    public final String f54838b;
    public final boolean f54839c;
    public final int d;
    public final boolean f54840e;
    public final String f54841f;
    public final h[] h;
    public final String f54842n;
    public final l f54843r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54837a = str;
        this.f54838b = str2;
        this.f54839c = z9;
        this.d = i7;
        this.f54840e = z10;
        this.f54841f = str3;
        this.h = hVarArr;
        this.f54842n = str4;
        this.f54843r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54839c == kVar.f54839c && this.d == kVar.d && this.f54840e == kVar.f54840e && q6.m.k(this.f54837a, kVar.f54837a) && q6.m.k(this.f54838b, kVar.f54838b) && q6.m.k(this.f54841f, kVar.f54841f) && q6.m.k(this.f54842n, kVar.f54842n) && q6.m.k(this.f54843r, kVar.f54843r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54837a, this.f54838b, Boolean.valueOf(this.f54839c), Integer.valueOf(this.d), Boolean.valueOf(this.f54840e), this.f54841f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54842n, this.f54843r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f54837a);
        wb.l(parcel, 2, this.f54838b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54839c ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f54840e ? 1 : 0);
        wb.l(parcel, 6, this.f54841f);
        wb.o(parcel, 7, this.h, i7);
        wb.l(parcel, 11, this.f54842n);
        wb.k(parcel, 12, this.f54843r, i7);
        wb.s(parcel, r10);
    }
}
