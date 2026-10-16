package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.s;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(25);
    public final boolean f47896a;
    public final String f47897b;
    public final String f47898c;
    public final boolean d;
    public final String e;
    public final ArrayList f47899f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f47896a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f47897b = str;
        this.f47898c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f47899f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47896a == aVar.f47896a && l.l(this.f47897b, aVar.f47897b) && l.l(this.f47898c, aVar.f47898c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f47899f, aVar.f47899f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47896a), this.f47897b, this.f47898c, Boolean.valueOf(this.d), this.e, this.f47899f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f47896a ? 1 : 0);
        f0.l(parcel, 2, this.f47897b);
        f0.l(parcel, 3, this.f47898c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.l(parcel, 5, this.e);
        f0.n(parcel, 6, this.f47899f);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.r(parcel, q6);
    }
}
