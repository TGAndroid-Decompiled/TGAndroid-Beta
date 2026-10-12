package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.s;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(25);
    public final boolean f47897a;
    public final String f47898b;
    public final String f47899c;
    public final boolean d;
    public final String e;
    public final ArrayList f47900f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f47897a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f47898b = str;
        this.f47899c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f47900f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47897a == aVar.f47897a && l.l(this.f47898b, aVar.f47898b) && l.l(this.f47899c, aVar.f47899c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f47900f, aVar.f47900f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47897a), this.f47898b, this.f47899c, Boolean.valueOf(this.d), this.e, this.f47900f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f47897a ? 1 : 0);
        g0.l(parcel, 2, this.f47898b);
        g0.l(parcel, 3, this.f47899c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.l(parcel, 5, this.e);
        g0.n(parcel, 6, this.f47900f);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
