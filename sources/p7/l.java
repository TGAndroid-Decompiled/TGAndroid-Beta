package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45567a;
    public final String f45568b;
    public final boolean f45569c;
    public final int d;
    public final boolean f45570e;
    public final String f45571f;
    public final h[] h;
    public final String f45572n;
    public final m f45573r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45567a = str;
        this.f45568b = str2;
        this.f45569c = z10;
        this.d = i10;
        this.f45570e = z11;
        this.f45571f = str3;
        this.h = hVarArr;
        this.f45572n = str4;
        this.f45573r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45569c == lVar.f45569c && this.d == lVar.d && this.f45570e == lVar.f45570e && n6.m.l(this.f45567a, lVar.f45567a) && n6.m.l(this.f45568b, lVar.f45568b) && n6.m.l(this.f45571f, lVar.f45571f) && n6.m.l(this.f45572n, lVar.f45572n) && n6.m.l(this.f45573r, lVar.f45573r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45567a, this.f45568b, Boolean.valueOf(this.f45569c), Integer.valueOf(this.d), Boolean.valueOf(this.f45570e), this.f45571f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45572n, this.f45573r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45567a);
        d0.l(parcel, 2, this.f45568b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45569c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f45570e ? 1 : 0);
        d0.l(parcel, 6, this.f45571f);
        d0.o(parcel, 7, this.h, i10);
        d0.l(parcel, 11, this.f45572n);
        d0.k(parcel, 12, this.f45573r, i10);
        d0.r(parcel, q6);
    }
}
