package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.r;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f44666a;
    public final String f44667b;
    public final String f44668c;
    public final boolean d;
    public final String e;
    public final ArrayList f44669f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f44666a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f44667b = str;
        this.f44668c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f44669f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44666a == aVar.f44666a && l.l(this.f44667b, aVar.f44667b) && l.l(this.f44668c, aVar.f44668c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f44669f, aVar.f44669f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44666a), this.f44667b, this.f44668c, Boolean.valueOf(this.d), this.e, this.f44669f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44666a ? 1 : 0);
        e0.l(parcel, 2, this.f44667b);
        e0.l(parcel, 3, this.f44668c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.l(parcel, 5, this.e);
        e0.n(parcel, 6, this.f44669f);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        e0.r(parcel, q6);
    }
}
