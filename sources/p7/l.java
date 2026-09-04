package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new j(1);
    public final String f43977a;
    public final String f43978b;
    public final boolean f43979c;
    public final int d;
    public final boolean f43980e;
    public final String f43981f;
    public final h[] h;
    public final String f43982n;
    public final m f43983r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, m mVar) {
        this.f43977a = str;
        this.f43978b = str2;
        this.f43979c = z10;
        this.d = i10;
        this.f43980e = z11;
        this.f43981f = str3;
        this.h = hVarArr;
        this.f43982n = str4;
        this.f43983r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f43979c == lVar.f43979c && this.d == lVar.d && this.f43980e == lVar.f43980e && n6.l.l(this.f43977a, lVar.f43977a) && n6.l.l(this.f43978b, lVar.f43978b) && n6.l.l(this.f43981f, lVar.f43981f) && n6.l.l(this.f43982n, lVar.f43982n) && n6.l.l(this.f43983r, lVar.f43983r) && Arrays.equals(this.h, lVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43977a, this.f43978b, Boolean.valueOf(this.f43979c), Integer.valueOf(this.d), Boolean.valueOf(this.f43980e), this.f43981f, Integer.valueOf(Arrays.hashCode(this.h)), this.f43982n, this.f43983r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43977a);
        e0.l(parcel, 2, this.f43978b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43979c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f43980e ? 1 : 0);
        e0.l(parcel, 6, this.f43981f);
        e0.o(parcel, 7, this.h, i10);
        e0.l(parcel, 11, this.f43982n);
        e0.k(parcel, 12, this.f43983r, i10);
        e0.r(parcel, q6);
    }
}
