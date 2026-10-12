package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n6.m;
import v8.r;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(27);
    public final boolean f50898a;
    public final String f50899b;
    public final String f50900c;
    public final boolean d;
    public final String f50901e;
    public final ArrayList f50902f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        m.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f50898a = z10;
        if (z10) {
            m.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f50899b = str;
        this.f50900c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f50902f = arrayList2;
        this.f50901e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f50898a == aVar.f50898a && m.l(this.f50899b, aVar.f50899b) && m.l(this.f50900c, aVar.f50900c) && this.d == aVar.d && m.l(this.f50901e, aVar.f50901e) && m.l(this.f50902f, aVar.f50902f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50898a), this.f50899b, this.f50900c, Boolean.valueOf(this.d), this.f50901e, this.f50902f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f50898a ? 1 : 0);
        c0.l(parcel, 2, this.f50899b);
        c0.l(parcel, 3, this.f50900c);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        c0.l(parcel, 5, this.f50901e);
        c0.n(parcel, 6, this.f50902f);
        c0.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        c0.r(parcel, q6);
    }
}
