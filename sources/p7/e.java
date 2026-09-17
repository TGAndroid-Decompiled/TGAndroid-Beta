package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f40717a;
    public final String f40718b;
    public final boolean f40719c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f40717a = gVarArr;
        this.f40718b = str;
        this.f40719c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f40718b, eVar.f40718b) && n6.l.l(Boolean.valueOf(this.f40719c), Boolean.valueOf(eVar.f40719c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f40717a, eVar.f40717a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40718b, Boolean.valueOf(this.f40719c), this.d, Integer.valueOf(Arrays.hashCode(this.f40717a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 1, this.f40717a, i10);
        e0.l(parcel, 2, this.f40718b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40719c ? 1 : 0);
        e0.k(parcel, 4, this.d, i10);
        e0.r(parcel, q6);
    }
}
