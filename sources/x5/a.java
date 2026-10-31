package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.s;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(24);
    public final boolean f53063a;
    public final String f53064b;
    public final String f53065c;
    public final boolean d;
    public final String e;
    public final ArrayList f53066f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f53063a = z10;
        if (z10) {
            l.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f53064b = str;
        this.f53065c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f53066f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f53063a == aVar.f53063a && l.k(this.f53064b, aVar.f53064b) && l.k(this.f53065c, aVar.f53065c) && this.d == aVar.d && l.k(this.e, aVar.e) && l.k(this.f53066f, aVar.f53066f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f53063a), this.f53064b, this.f53065c, Boolean.valueOf(this.d), this.e, this.f53066f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53063a ? 1 : 0);
        h0.l(parcel, 2, this.f53064b);
        h0.l(parcel, 3, this.f53065c);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.l(parcel, 5, this.e);
        h0.n(parcel, 6, this.f53066f);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        h0.r(parcel, q6);
    }
}
