package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f41061a;
    public final String f41062b;
    public final boolean f41063c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f41061a = gVarArr;
        this.f41062b = str;
        this.f41063c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f41062b, eVar.f41062b) && n6.l.l(Boolean.valueOf(this.f41063c), Boolean.valueOf(eVar.f41063c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f41061a, eVar.f41061a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41062b, Boolean.valueOf(this.f41063c), this.d, Integer.valueOf(Arrays.hashCode(this.f41061a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f41061a, i10);
        f0.l(parcel, 2, this.f41062b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f41063c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
