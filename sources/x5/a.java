package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.m;
import v8.r;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f50749a;
    public final String f50750b;
    public final String f50751c;
    public final boolean d;
    public final String f50752e;
    public final ArrayList f50753f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f50749a = z10;
        if (z10) {
            m.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f50750b = str;
        this.f50751c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f50753f = arrayList2;
        this.f50752e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f50749a == aVar.f50749a && m.l(this.f50750b, aVar.f50750b) && m.l(this.f50751c, aVar.f50751c) && this.d == aVar.d && m.l(this.f50752e, aVar.f50752e) && m.l(this.f50753f, aVar.f50753f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50749a), this.f50750b, this.f50751c, Boolean.valueOf(this.d), this.f50752e, this.f50753f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50749a ? 1 : 0);
        d0.l(parcel, 2, this.f50750b);
        d0.l(parcel, 3, this.f50751c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.l(parcel, 5, this.f50752e);
        d0.n(parcel, 6, this.f50753f);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        d0.r(parcel, q6);
    }
}
