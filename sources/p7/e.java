package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f40989a;
    public final String f40990b;
    public final boolean f40991c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f40989a = gVarArr;
        this.f40990b = str;
        this.f40991c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f40990b, eVar.f40990b) && n6.l.l(Boolean.valueOf(this.f40991c), Boolean.valueOf(eVar.f40991c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f40989a, eVar.f40989a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40990b, Boolean.valueOf(this.f40991c), this.d, Integer.valueOf(Arrays.hashCode(this.f40989a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f40989a, i10);
        f0.l(parcel, 2, this.f40990b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40991c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
