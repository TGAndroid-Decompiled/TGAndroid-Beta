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
    public final boolean f48889a;
    public final String f48890b;
    public final String f48891c;
    public final boolean d;
    public final String f48892e;
    public final ArrayList f48893f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f48889a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f48890b = str;
        this.f48891c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f48893f = arrayList2;
        this.f48892e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48889a == aVar.f48889a && l.l(this.f48890b, aVar.f48890b) && l.l(this.f48891c, aVar.f48891c) && this.d == aVar.d && l.l(this.f48892e, aVar.f48892e) && l.l(this.f48893f, aVar.f48893f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48889a), this.f48890b, this.f48891c, Boolean.valueOf(this.d), this.f48892e, this.f48893f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f48889a ? 1 : 0);
        e0.l(parcel, 2, this.f48890b);
        e0.l(parcel, 3, this.f48891c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.l(parcel, 5, this.f48892e);
        e0.n(parcel, 6, this.f48893f);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        e0.r(parcel, q6);
    }
}
