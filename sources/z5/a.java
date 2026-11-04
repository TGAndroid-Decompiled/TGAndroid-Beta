package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p6.m;
import y8.i;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new i(3);
    public final boolean f59765a;
    public final String f59766b;
    public final String f59767c;
    public final boolean d;
    public final String f59768e;
    public final ArrayList f59769f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f59765a = z10;
        if (z10) {
            m.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f59766b = str;
        this.f59767c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f59769f = arrayList2;
        this.f59768e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59765a == aVar.f59765a && m.k(this.f59766b, aVar.f59766b) && m.k(this.f59767c, aVar.f59767c) && this.d == aVar.d && m.k(this.f59768e, aVar.f59768e) && m.k(this.f59769f, aVar.f59769f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59765a), this.f59766b, this.f59767c, Boolean.valueOf(this.d), this.f59768e, this.f59769f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f59765a ? 1 : 0);
        j8.a.m(parcel, 2, this.f59766b);
        j8.a.m(parcel, 3, this.f59767c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.m(parcel, 5, this.f59768e);
        j8.a.o(parcel, 6, this.f59769f);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
