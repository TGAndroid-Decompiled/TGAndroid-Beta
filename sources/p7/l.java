package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f43978a;
    public final String f43979b;
    public final boolean f43980c;
    public final int d;
    public final boolean f43981e;
    public final String f43982f;
    public final h[] h;
    public final String f43983n;
    public final m f43984r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f43978a = str;
        this.f43979b = str2;
        this.f43980c = z10;
        this.d = i10;
        this.f43981e = z11;
        this.f43982f = str3;
        this.h = hVarArr;
        this.f43983n = str4;
        this.f43984r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f43980c == lVar.f43980c && this.d == lVar.d && this.f43981e == lVar.f43981e && n6.l.l(this.f43978a, lVar.f43978a) && n6.l.l(this.f43979b, lVar.f43979b) && n6.l.l(this.f43982f, lVar.f43982f) && n6.l.l(this.f43983n, lVar.f43983n) && n6.l.l(this.f43984r, lVar.f43984r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43978a, this.f43979b, Boolean.valueOf(this.f43980c), Integer.valueOf(this.d), Boolean.valueOf(this.f43981e), this.f43982f, Integer.valueOf(Arrays.hashCode(this.h)), this.f43983n, this.f43984r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43978a);
        e0.l(parcel, 2, this.f43979b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43980c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f43981e ? 1 : 0);
        e0.l(parcel, 6, this.f43982f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f43983n);
        e0.k(parcel, 12, this.f43984r, i10);
        e0.r(parcel, q6);
    }
}
