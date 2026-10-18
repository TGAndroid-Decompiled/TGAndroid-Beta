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
    public final boolean f49283a;
    public final String f49284b;
    public final String f49285c;
    public final boolean d;
    public final String e;
    public final ArrayList f49286f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f49283a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f49284b = str;
        this.f49285c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f49286f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49283a == aVar.f49283a && l.l(this.f49284b, aVar.f49284b) && l.l(this.f49285c, aVar.f49285c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f49286f, aVar.f49286f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49283a), this.f49284b, this.f49285c, Boolean.valueOf(this.d), this.e, this.f49286f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49283a ? 1 : 0);
        f0.l(parcel, 2, this.f49284b);
        f0.l(parcel, 3, this.f49285c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.l(parcel, 5, this.e);
        f0.n(parcel, 6, this.f49286f);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f0.r(parcel, q6);
    }
}
