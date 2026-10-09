package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.l;
import v8.r;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f50661a;
    public final String f50662b;
    public final String f50663c;
    public final boolean d;
    public final String f50664e;
    public final ArrayList f50665f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f50661a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f50662b = str;
        this.f50663c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f50665f = arrayList2;
        this.f50664e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f50661a == aVar.f50661a && l.l(this.f50662b, aVar.f50662b) && l.l(this.f50663c, aVar.f50663c) && this.d == aVar.d && l.l(this.f50664e, aVar.f50664e) && l.l(this.f50665f, aVar.f50665f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50661a), this.f50662b, this.f50663c, Boolean.valueOf(this.d), this.f50664e, this.f50665f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50661a ? 1 : 0);
        d0.l(parcel, 2, this.f50662b);
        d0.l(parcel, 3, this.f50663c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.l(parcel, 5, this.f50664e);
        d0.n(parcel, 6, this.f50665f);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        d0.r(parcel, q6);
    }
}
