package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new x(21);
    public final String f54953a;
    public final String f54954b;
    public final boolean f54955c;
    public final int d;
    public final boolean f54956e;
    public final String f54957f;
    public final h[] h;
    public final String f54958n;
    public final l f54959r;

    public k(String str, String str2, boolean z9, int i7, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.f54953a = str;
        this.f54954b = str2;
        this.f54955c = z9;
        this.d = i7;
        this.f54956e = z10;
        this.f54957f = str3;
        this.h = hVarArr;
        this.f54958n = str4;
        this.f54959r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f54955c == kVar.f54955c && this.d == kVar.d && this.f54956e == kVar.f54956e && q6.m.k(this.f54953a, kVar.f54953a) && q6.m.k(this.f54954b, kVar.f54954b) && q6.m.k(this.f54957f, kVar.f54957f) && q6.m.k(this.f54958n, kVar.f54958n) && q6.m.k(this.f54959r, kVar.f54959r) && Arrays.equals(this.h, kVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54953a, this.f54954b, Boolean.valueOf(this.f54955c), Integer.valueOf(this.d), Boolean.valueOf(this.f54956e), this.f54957f, Integer.valueOf(Arrays.hashCode(this.h)), this.f54958n, this.f54959r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f54953a);
        xb.l(parcel, 2, this.f54954b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54955c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f54956e ? 1 : 0);
        xb.l(parcel, 6, this.f54957f);
        xb.o(parcel, 7, this.h, i7);
        xb.l(parcel, 11, this.f54958n);
        xb.k(parcel, 12, this.f54959r, i7);
        xb.s(parcel, r10);
    }
}
