package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f54937a;
    public final String f54938b;
    public final boolean f54939c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.f54937a = gVarArr;
        this.f54938b = str;
        this.f54939c = z9;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f54938b, eVar.f54938b) && q6.m.k(Boolean.valueOf(this.f54939c), Boolean.valueOf(eVar.f54939c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f54937a, eVar.f54937a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54938b, Boolean.valueOf(this.f54939c), this.d, Integer.valueOf(Arrays.hashCode(this.f54937a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 1, this.f54937a, i7);
        xb.l(parcel, 2, this.f54938b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54939c ? 1 : 0);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
