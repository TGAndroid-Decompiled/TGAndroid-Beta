package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.r;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f49378a;
    public final String f49379b;
    public final String f49380c;
    public final boolean d;
    public final String f49381e;
    public final ArrayList f49382f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f49378a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f49379b = str;
        this.f49380c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f49382f = arrayList2;
        this.f49381e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49378a == aVar.f49378a && l.l(this.f49379b, aVar.f49379b) && l.l(this.f49380c, aVar.f49380c) && this.d == aVar.d && l.l(this.f49381e, aVar.f49381e) && l.l(this.f49382f, aVar.f49382f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49378a), this.f49379b, this.f49380c, Boolean.valueOf(this.d), this.f49381e, this.f49382f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49378a ? 1 : 0);
        g0.l(parcel, 2, this.f49379b);
        g0.l(parcel, 3, this.f49380c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.l(parcel, 5, this.f49381e);
        g0.n(parcel, 6, this.f49382f);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
