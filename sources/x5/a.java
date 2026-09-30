package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.r;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f45712a;
    public final String f45713b;
    public final String f45714c;
    public final boolean d;
    public final String e;
    public final ArrayList f45715f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f45712a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f45713b = str;
        this.f45714c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f45715f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45712a == aVar.f45712a && l.l(this.f45713b, aVar.f45713b) && l.l(this.f45714c, aVar.f45714c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f45715f, aVar.f45715f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45712a), this.f45713b, this.f45714c, Boolean.valueOf(this.d), this.e, this.f45715f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45712a ? 1 : 0);
        f0.l(parcel, 2, this.f45713b);
        f0.l(parcel, 3, this.f45714c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.l(parcel, 5, this.e);
        f0.n(parcel, 6, this.f45715f);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.r(parcel, q6);
    }
}
