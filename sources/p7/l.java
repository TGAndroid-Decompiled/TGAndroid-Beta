package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f45533a;
    public final String f45534b;
    public final boolean f45535c;
    public final int d;
    public final boolean f45536e;
    public final String f45537f;
    public final h[] h;
    public final String f45538n;
    public final m f45539r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f45533a = str;
        this.f45534b = str2;
        this.f45535c = z10;
        this.d = i10;
        this.f45536e = z11;
        this.f45537f = str3;
        this.h = hVarArr;
        this.f45538n = str4;
        this.f45539r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f45535c == lVar.f45535c && this.d == lVar.d && this.f45536e == lVar.f45536e && n6.m.l(this.f45533a, lVar.f45533a) && n6.m.l(this.f45534b, lVar.f45534b) && n6.m.l(this.f45537f, lVar.f45537f) && n6.m.l(this.f45538n, lVar.f45538n) && n6.m.l(this.f45539r, lVar.f45539r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45533a, this.f45534b, Boolean.valueOf(this.f45535c), Integer.valueOf(this.d), Boolean.valueOf(this.f45536e), this.f45537f, Integer.valueOf(Arrays.hashCode(this.h)), this.f45538n, this.f45539r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f45533a);
        d0.l(parcel, 2, this.f45534b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45535c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f45536e ? 1 : 0);
        d0.l(parcel, 6, this.f45537f);
        d0.o(parcel, 7, this.h, i10);
        d0.l(parcel, 11, this.f45538n);
        d0.k(parcel, 12, this.f45539r, i10);
        d0.r(parcel, q6);
    }
}
