package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f56521a;
    public final String f56522b;
    public final boolean f56523c;
    public final int d;
    public final boolean f56524e;
    public final String f56525f;
    public final h[] h;
    public final String f56526n;
    public final l f56527r;

    public k(String str, String str2, boolean z10, int i7, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f56521a = str;
        this.f56522b = str2;
        this.f56523c = z10;
        this.d = i7;
        this.f56524e = z11;
        this.f56525f = str3;
        this.h = hVarArr;
        this.f56526n = str4;
        this.f56527r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f56523c == kVar.f56523c && this.d == kVar.d && this.f56524e == kVar.f56524e && q6.m.k(this.f56521a, kVar.f56521a) && q6.m.k(this.f56522b, kVar.f56522b) && q6.m.k(this.f56525f, kVar.f56525f) && q6.m.k(this.f56526n, kVar.f56526n) && q6.m.k(this.f56527r, kVar.f56527r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56521a, this.f56522b, Boolean.valueOf(this.f56523c), Integer.valueOf(this.d), Boolean.valueOf(this.f56524e), this.f56525f, Integer.valueOf(Arrays.hashCode(this.h)), this.f56526n, this.f56527r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f56521a);
        yb.l(parcel, 2, this.f56522b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f56523c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f56524e ? 1 : 0);
        yb.l(parcel, 6, this.f56525f);
        yb.o(parcel, 7, this.h, i7);
        yb.l(parcel, 11, this.f56526n);
        yb.k(parcel, 12, this.f56527r, i7);
        yb.s(parcel, r10);
    }
}
