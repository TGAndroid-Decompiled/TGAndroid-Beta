package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f54936a;
    public final String f54937b;
    public final boolean f54938c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.f54936a = gVarArr;
        this.f54937b = str;
        this.f54938c = z9;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f54937b, eVar.f54937b) && q6.m.k(Boolean.valueOf(this.f54938c), Boolean.valueOf(eVar.f54938c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f54936a, eVar.f54936a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54937b, Boolean.valueOf(this.f54938c), this.d, Integer.valueOf(Arrays.hashCode(this.f54936a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 1, this.f54936a, i7);
        xb.l(parcel, 2, this.f54937b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54938c ? 1 : 0);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
