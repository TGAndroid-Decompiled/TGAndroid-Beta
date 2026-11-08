package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54954a;
    public final String f54955b;
    public final boolean f54956c;
    public final int d;
    public final boolean f54957e;
    public final String f54958f;
    public final h[] h;
    public final String f54959n;
    public final l f54960r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54954a = str;
        this.f54955b = str2;
        this.f54956c = z9;
        this.d = i7;
        this.f54957e = z10;
        this.f54958f = str3;
        this.h = hVarArr;
        this.f54959n = str4;
        this.f54960r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54956c == kVar.f54956c && this.d == kVar.d && this.f54957e == kVar.f54957e && q6.m.k(this.f54954a, kVar.f54954a) && q6.m.k(this.f54955b, kVar.f54955b) && q6.m.k(this.f54958f, kVar.f54958f) && q6.m.k(this.f54959n, kVar.f54959n) && q6.m.k(this.f54960r, kVar.f54960r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54954a, this.f54955b, Boolean.valueOf(this.f54956c), Integer.valueOf(this.d), Boolean.valueOf(this.f54957e), this.f54958f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54959n, this.f54960r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54954a);
        xb.l(parcel, 2, this.f54955b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54956c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f54957e ? 1 : 0);
        xb.l(parcel, 6, this.f54958f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.f54959n);
        xb.k(parcel, 12, this.f54960r, i7);
        xb.s(parcel, r10);
    }
}
