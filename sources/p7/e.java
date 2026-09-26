package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f40961a;
    public final String f40962b;
    public final boolean f40963c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f40961a = gVarArr;
        this.f40962b = str;
        this.f40963c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f40962b, eVar.f40962b) && n6.l.l(Boolean.valueOf(this.f40963c), Boolean.valueOf(eVar.f40963c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f40961a, eVar.f40961a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40962b, Boolean.valueOf(this.f40963c), this.d, Integer.valueOf(Arrays.hashCode(this.f40961a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f40961a, i10);
        f0.l(parcel, 2, this.f40962b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40963c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
