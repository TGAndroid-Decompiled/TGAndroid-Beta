package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(24);
    public final g[] f43149a;
    public final String f43150b;
    public final boolean f43151c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f43149a = gVarArr;
        this.f43150b = str;
        this.f43151c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f43150b, eVar.f43150b) && n6.l.l(Boolean.valueOf(this.f43151c), Boolean.valueOf(eVar.f43151c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f43149a, eVar.f43149a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43150b, Boolean.valueOf(this.f43151c), this.d, Integer.valueOf(Arrays.hashCode(this.f43149a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.o(parcel, 1, this.f43149a, i10);
        g0.l(parcel, 2, this.f43150b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f43151c ? 1 : 0);
        g0.k(parcel, 4, this.d, i10);
        g0.r(parcel, q6);
    }
}
