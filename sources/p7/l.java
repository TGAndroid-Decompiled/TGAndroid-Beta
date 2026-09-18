package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f40739a;
    public final String f40740b;
    public final boolean f40741c;
    public final int d;
    public final boolean e;
    public final String f40742f;
    public final h[] h;
    public final String f40743n;
    public final m f40744r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f40739a = str;
        this.f40740b = str2;
        this.f40741c = z10;
        this.d = i10;
        this.e = z11;
        this.f40742f = str3;
        this.h = hVarArr;
        this.f40743n = str4;
        this.f40744r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40741c == lVar.f40741c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f40739a, lVar.f40739a) && n6.l.l(this.f40740b, lVar.f40740b) && n6.l.l(this.f40742f, lVar.f40742f) && n6.l.l(this.f40743n, lVar.f40743n) && n6.l.l(this.f40744r, lVar.f40744r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40739a, this.f40740b, Boolean.valueOf(this.f40741c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f40742f, Integer.valueOf(Arrays.hashCode(this.h)), this.f40743n, this.f40744r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f40739a);
        e0.l(parcel, 2, this.f40740b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40741c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f40742f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f40743n);
        e0.k(parcel, 12, this.f40744r, i10);
        e0.r(parcel, q6);
    }
}
