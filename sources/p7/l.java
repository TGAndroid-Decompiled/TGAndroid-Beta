package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44319a;
    public final String f44320b;
    public final boolean f44321c;
    public final int d;
    public final boolean f44322e;
    public final String f44323f;
    public final h[] h;
    public final String f44324n;
    public final m f44325r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44319a = str;
        this.f44320b = str2;
        this.f44321c = z10;
        this.d = i10;
        this.f44322e = z11;
        this.f44323f = str3;
        this.h = hVarArr;
        this.f44324n = str4;
        this.f44325r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44321c == lVar.f44321c && this.d == lVar.d && this.f44322e == lVar.f44322e && n6.l.l(this.f44319a, lVar.f44319a) && n6.l.l(this.f44320b, lVar.f44320b) && n6.l.l(this.f44323f, lVar.f44323f) && n6.l.l(this.f44324n, lVar.f44324n) && n6.l.l(this.f44325r, lVar.f44325r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44319a, this.f44320b, Boolean.valueOf(this.f44321c), Integer.valueOf(this.d), Boolean.valueOf(this.f44322e), this.f44323f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44324n, this.f44325r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44319a);
        g0.l(parcel, 2, this.f44320b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44321c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f44322e ? 1 : 0);
        g0.l(parcel, 6, this.f44323f);
        g0.o(parcel, 7, this.h, i10);
        g0.l(parcel, 11, this.f44324n);
        g0.k(parcel, 12, this.f44325r, i10);
        g0.r(parcel, q6);
    }
}
