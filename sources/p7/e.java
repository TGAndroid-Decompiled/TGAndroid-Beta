package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f45481a;
    public final String f45482b;
    public final boolean f45483c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f45481a = gVarArr;
        this.f45482b = str;
        this.f45483c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f45482b, eVar.f45482b) && n6.l.l(Boolean.valueOf(this.f45483c), Boolean.valueOf(eVar.f45483c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f45481a, eVar.f45481a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45482b, Boolean.valueOf(this.f45483c), this.d, Integer.valueOf(Arrays.hashCode(this.f45481a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.o(parcel, 1, this.f45481a, i10);
        d0.l(parcel, 2, this.f45482b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45483c ? 1 : 0);
        d0.k(parcel, 4, this.d, i10);
        d0.r(parcel, q6);
    }
}
