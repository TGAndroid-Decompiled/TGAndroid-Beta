package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f40962a;
    public final String f40963b;
    public final boolean f40964c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f40962a = gVarArr;
        this.f40963b = str;
        this.f40964c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f40963b, eVar.f40963b) && n6.l.l(Boolean.valueOf(this.f40964c), Boolean.valueOf(eVar.f40964c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f40962a, eVar.f40962a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40963b, Boolean.valueOf(this.f40964c), this.d, Integer.valueOf(Arrays.hashCode(this.f40962a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f40962a, i10);
        f0.l(parcel, 2, this.f40963b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40964c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
