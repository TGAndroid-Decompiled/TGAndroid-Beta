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
    public final boolean f49385a;
    public final String f49386b;
    public final String f49387c;
    public final boolean d;
    public final String f49388e;
    public final ArrayList f49389f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f49385a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f49386b = str;
        this.f49387c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f49389f = arrayList2;
        this.f49388e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49385a == aVar.f49385a && l.l(this.f49386b, aVar.f49386b) && l.l(this.f49387c, aVar.f49387c) && this.d == aVar.d && l.l(this.f49388e, aVar.f49388e) && l.l(this.f49389f, aVar.f49389f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49385a), this.f49386b, this.f49387c, Boolean.valueOf(this.d), this.f49388e, this.f49389f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49385a ? 1 : 0);
        g0.l(parcel, 2, this.f49386b);
        g0.l(parcel, 3, this.f49387c);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.l(parcel, 5, this.f49388e);
        g0.n(parcel, 6, this.f49389f);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
