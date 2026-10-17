package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new m8.h(29);
    public final String f44276a;
    public final String f44277b;
    public final boolean f44278c;
    public final int d;
    public final boolean e;
    public final String f44279f;
    public final h[] h;
    public final String f44280n;
    public final l f44281r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.f44276a = str;
        this.f44277b = str2;
        this.f44278c = z10;
        this.d = i10;
        this.e = z11;
        this.f44279f = str3;
        this.h = hVarArr;
        this.f44280n = str4;
        this.f44281r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f44278c == kVar.f44278c && this.d == kVar.d && this.e == kVar.e && n6.l.l(this.f44276a, kVar.f44276a) && n6.l.l(this.f44277b, kVar.f44277b) && n6.l.l(this.f44279f, kVar.f44279f) && n6.l.l(this.f44280n, kVar.f44280n) && n6.l.l(this.f44281r, kVar.f44281r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44276a, this.f44277b, Boolean.valueOf(this.f44278c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f44279f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44280n, this.f44281r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f44276a);
        f0.l(parcel, 2, this.f44277b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44278c ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f0.l(parcel, 6, this.f44279f);
        f0.o(parcel, 7, this.h, i10);
        f0.l(parcel, 11, this.f44280n);
        f0.k(parcel, 12, this.f44281r, i10);
        f0.r(parcel, q6);
    }
}
