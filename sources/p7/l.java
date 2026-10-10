package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45543a;
    public final String f45544b;
    public final boolean f45545c;
    public final int d;
    public final boolean f45546e;
    public final String f45547f;
    public final h[] h;
    public final String f45548n;
    public final m f45549r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45543a = str;
        this.f45544b = str2;
        this.f45545c = z10;
        this.d = i10;
        this.f45546e = z11;
        this.f45547f = str3;
        this.h = hVarArr;
        this.f45548n = str4;
        this.f45549r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45545c == lVar.f45545c && this.d == lVar.d && this.f45546e == lVar.f45546e && n6.l.l(this.f45543a, lVar.f45543a) && n6.l.l(this.f45544b, lVar.f45544b) && n6.l.l(this.f45547f, lVar.f45547f) && n6.l.l(this.f45548n, lVar.f45548n) && n6.l.l(this.f45549r, lVar.f45549r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45543a, this.f45544b, Boolean.valueOf(this.f45545c), Integer.valueOf(this.d), Boolean.valueOf(this.f45546e), this.f45547f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45548n, this.f45549r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45543a);
        d0.l(parcel, 2, this.f45544b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45545c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f45546e ? 1 : 0);
        d0.l(parcel, 6, this.f45547f);
        d0.o(parcel, 7, this.h, i10);
        d0.l(parcel, 11, this.f45548n);
        d0.k(parcel, 12, this.f45549r, i10);
        d0.r(parcel, q6);
    }
}
