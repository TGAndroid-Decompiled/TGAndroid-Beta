package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(24);
    public final g[] f42850a;
    public final String f42851b;
    public final boolean f42852c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f42850a = gVarArr;
        this.f42851b = str;
        this.f42852c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f42851b, eVar.f42851b) && n6.l.l(Boolean.valueOf(this.f42852c), Boolean.valueOf(eVar.f42852c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f42850a, eVar.f42850a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42851b, Boolean.valueOf(this.f42852c), this.d, Integer.valueOf(Arrays.hashCode(this.f42850a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f42850a, i10);
        f0.l(parcel, 2, this.f42851b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f42852c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
