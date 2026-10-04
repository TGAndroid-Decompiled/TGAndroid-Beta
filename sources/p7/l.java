package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44318a;
    public final String f44319b;
    public final boolean f44320c;
    public final int d;
    public final boolean f44321e;
    public final String f44322f;
    public final h[] h;
    public final String f44323n;
    public final m f44324r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44318a = str;
        this.f44319b = str2;
        this.f44320c = z10;
        this.d = i10;
        this.f44321e = z11;
        this.f44322f = str3;
        this.h = hVarArr;
        this.f44323n = str4;
        this.f44324r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44320c == lVar.f44320c && this.d == lVar.d && this.f44321e == lVar.f44321e && n6.l.l(this.f44318a, lVar.f44318a) && n6.l.l(this.f44319b, lVar.f44319b) && n6.l.l(this.f44322f, lVar.f44322f) && n6.l.l(this.f44323n, lVar.f44323n) && n6.l.l(this.f44324r, lVar.f44324r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44318a, this.f44319b, Boolean.valueOf(this.f44320c), Integer.valueOf(this.d), Boolean.valueOf(this.f44321e), this.f44322f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44323n, this.f44324r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f44318a);
        g0.l(parcel, 2, this.f44319b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44320c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f44321e ? 1 : 0);
        g0.l(parcel, 6, this.f44322f);
        g0.o(parcel, 7, this.h, i10);
        g0.l(parcel, 11, this.f44323n);
        g0.k(parcel, 12, this.f44324r, i10);
        g0.r(parcel, q6);
    }
}
