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
    public final boolean f49305a;
    public final String f49306b;
    public final String f49307c;
    public final boolean d;
    public final String e;
    public final ArrayList f49308f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f49305a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f49306b = str;
        this.f49307c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f49308f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49305a == aVar.f49305a && l.l(this.f49306b, aVar.f49306b) && l.l(this.f49307c, aVar.f49307c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f49308f, aVar.f49308f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49305a), this.f49306b, this.f49307c, Boolean.valueOf(this.d), this.e, this.f49308f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49305a ? 1 : 0);
        f0.l(parcel, 2, this.f49306b);
        f0.l(parcel, 3, this.f49307c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.l(parcel, 5, this.e);
        f0.n(parcel, 6, this.f49308f);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.r(parcel, q6);
    }
}
