package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f57136a;
    public final String f57137b;
    public final boolean f57138c;
    public final int d;
    public final boolean f57139e;
    public final String f57140f;
    public final h[] h;
    public final String f57141n;
    public final l f57142r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f57136a = str;
        this.f57137b = str2;
        this.f57138c = z10;
        this.d = i7;
        this.f57139e = z11;
        this.f57140f = str3;
        this.h = hVarArr;
        this.f57141n = str4;
        this.f57142r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f57138c == kVar.f57138c && this.d == kVar.d && this.f57139e == kVar.f57139e && q6.m.l(this.f57136a, kVar.f57136a) && q6.m.l(this.f57137b, kVar.f57137b) && q6.m.l(this.f57140f, kVar.f57140f) && q6.m.l(this.f57141n, kVar.f57141n) && q6.m.l(this.f57142r, kVar.f57142r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57136a, this.f57137b, Boolean.valueOf(this.f57138c), Integer.valueOf(this.d), Boolean.valueOf(this.f57139e), this.f57140f, Integer.valueOf(Arrays.hashCode(this.h)), this.f57141n, this.f57142r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f57136a);
        bc.l(parcel, 2, this.f57137b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57138c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f57139e ? 1 : 0);
        bc.l(parcel, 6, this.f57140f);
        bc.o(parcel, 7, this.h, i7);
        bc.l(parcel, 11, this.f57141n);
        bc.k(parcel, 12, this.f57142r, i7);
        bc.s(parcel, r10);
    }
}
