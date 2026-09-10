package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f39837a;
    public final String f39838b;
    public final boolean f39839c;
    public final int d;
    public final boolean e;
    public final String f39840f;
    public final h[] h;
    public final String f39841n;
    public final m f39842r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f39837a = str;
        this.f39838b = str2;
        this.f39839c = z10;
        this.d = i10;
        this.e = z11;
        this.f39840f = str3;
        this.h = hVarArr;
        this.f39841n = str4;
        this.f39842r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f39839c == lVar.f39839c && this.d == lVar.d && this.e == lVar.e && n6.l.l(this.f39837a, lVar.f39837a) && n6.l.l(this.f39838b, lVar.f39838b) && n6.l.l(this.f39840f, lVar.f39840f) && n6.l.l(this.f39841n, lVar.f39841n) && n6.l.l(this.f39842r, lVar.f39842r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39837a, this.f39838b, Boolean.valueOf(this.f39839c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f39840f, Integer.valueOf(Arrays.hashCode(this.h)), this.f39841n, this.f39842r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f39837a);
        e0.l(parcel, 2, this.f39838b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f39839c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.l(parcel, 6, this.f39840f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f39841n);
        e0.k(parcel, 12, this.f39842r, i10);
        e0.r(parcel, q6);
    }
}
