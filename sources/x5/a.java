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
    public final boolean f53081a;
    public final String f53082b;
    public final String f53083c;
    public final boolean d;
    public final String e;
    public final ArrayList f53084f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f53081a = z10;
        if (z10) {
            l.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f53082b = str;
        this.f53083c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f53084f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f53081a == aVar.f53081a && l.k(this.f53082b, aVar.f53082b) && l.k(this.f53083c, aVar.f53083c) && this.d == aVar.d && l.k(this.e, aVar.e) && l.k(this.f53084f, aVar.f53084f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f53081a), this.f53082b, this.f53083c, Boolean.valueOf(this.d), this.e, this.f53084f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53081a ? 1 : 0);
        h0.l(parcel, 2, this.f53082b);
        h0.l(parcel, 3, this.f53083c);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.l(parcel, 5, this.e);
        h0.n(parcel, 6, this.f53084f);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        h0.r(parcel, q6);
    }
}
