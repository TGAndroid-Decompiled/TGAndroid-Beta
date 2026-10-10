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
    public final boolean f50705a;
    public final String f50706b;
    public final String f50707c;
    public final boolean d;
    public final String f50708e;
    public final ArrayList f50709f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f50705a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f50706b = str;
        this.f50707c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f50709f = arrayList2;
        this.f50708e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f50705a == aVar.f50705a && l.l(this.f50706b, aVar.f50706b) && l.l(this.f50707c, aVar.f50707c) && this.d == aVar.d && l.l(this.f50708e, aVar.f50708e) && l.l(this.f50709f, aVar.f50709f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50705a), this.f50706b, this.f50707c, Boolean.valueOf(this.d), this.f50708e, this.f50709f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50705a ? 1 : 0);
        d0.l(parcel, 2, this.f50706b);
        d0.l(parcel, 3, this.f50707c);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.l(parcel, 5, this.f50708e);
        d0.n(parcel, 6, this.f50709f);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        d0.r(parcel, q6);
    }
}
