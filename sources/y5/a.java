package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import o6.l;
import w8.s;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(25);
    public final boolean f52042a;
    public final String f52043b;
    public final String f52044c;
    public final boolean d;
    public final String e;
    public final ArrayList f52045f;
    public final boolean h;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        l.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.f52042a = z10;
        if (z10) {
            l.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f52043b = str;
        this.f52044c = str2;
        this.d = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f52045f = arrayList2;
        this.e = str3;
        this.h = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f52042a == aVar.f52042a && l.l(this.f52043b, aVar.f52043b) && l.l(this.f52044c, aVar.f52044c) && this.d == aVar.d && l.l(this.e, aVar.e) && l.l(this.f52045f, aVar.f52045f) && this.h == aVar.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52042a), this.f52043b, this.f52044c, Boolean.valueOf(this.d), this.e, this.f52045f, Boolean.valueOf(this.h)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52042a ? 1 : 0);
        df.l(parcel, 2, this.f52043b);
        df.l(parcel, 3, this.f52044c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.l(parcel, 5, this.e);
        df.n(parcel, 6, this.f52045f);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        df.r(parcel, q5);
    }
}
