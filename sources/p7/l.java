package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f44005a;
    public final String f44006b;
    public final boolean f44007c;
    public final int d;
    public final boolean f44008e;
    public final String f44009f;
    public final h[] h;
    public final String f44010n;
    public final m f44011r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f44005a = str;
        this.f44006b = str2;
        this.f44007c = z10;
        this.d = i10;
        this.f44008e = z11;
        this.f44009f = str3;
        this.h = hVarArr;
        this.f44010n = str4;
        this.f44011r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44007c == lVar.f44007c && this.d == lVar.d && this.f44008e == lVar.f44008e && n6.l.l(this.f44005a, lVar.f44005a) && n6.l.l(this.f44006b, lVar.f44006b) && n6.l.l(this.f44009f, lVar.f44009f) && n6.l.l(this.f44010n, lVar.f44010n) && n6.l.l(this.f44011r, lVar.f44011r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44005a, this.f44006b, Boolean.valueOf(this.f44007c), Integer.valueOf(this.d), Boolean.valueOf(this.f44008e), this.f44009f, Integer.valueOf(Arrays.hashCode(this.h)), this.f44010n, this.f44011r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f44005a);
        e0.l(parcel, 2, this.f44006b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f44007c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f44008e ? 1 : 0);
        e0.l(parcel, 6, this.f44009f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f44010n);
        e0.k(parcel, 12, this.f44011r, i10);
        e0.r(parcel, q6);
    }
}
