package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54862a;
    public final String f54863b;
    public final boolean f54864c;
    public final int d;
    public final boolean f54865e;
    public final String f54866f;
    public final h[] h;
    public final String f54867n;
    public final l f54868r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54862a = str;
        this.f54863b = str2;
        this.f54864c = z9;
        this.d = i7;
        this.f54865e = z10;
        this.f54866f = str3;
        this.h = hVarArr;
        this.f54867n = str4;
        this.f54868r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54864c == kVar.f54864c && this.d == kVar.d && this.f54865e == kVar.f54865e && q6.m.k(this.f54862a, kVar.f54862a) && q6.m.k(this.f54863b, kVar.f54863b) && q6.m.k(this.f54866f, kVar.f54866f) && q6.m.k(this.f54867n, kVar.f54867n) && q6.m.k(this.f54868r, kVar.f54868r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54862a, this.f54863b, Boolean.valueOf(this.f54864c), Integer.valueOf(this.d), Boolean.valueOf(this.f54865e), this.f54866f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54867n, this.f54868r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f54862a);
        wb.l(parcel, 2, this.f54863b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54864c ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f54865e ? 1 : 0);
        wb.l(parcel, 6, this.f54866f);
        wb.o(parcel, 7, this.h, i7);
        wb.l(parcel, 11, this.f54867n);
        wb.k(parcel, 12, this.f54868r, i7);
        wb.s(parcel, r10);
    }
}
