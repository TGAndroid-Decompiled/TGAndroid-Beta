package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f57088a;
    public final String f57089b;
    public final boolean f57090c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f57088a = gVarArr;
        this.f57089b = str;
        this.f57090c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.l(this.f57089b, eVar.f57089b) && q6.m.l(Boolean.valueOf(this.f57090c), Boolean.valueOf(eVar.f57090c)) && q6.m.l(this.d, eVar.d) && Arrays.equals(this.f57088a, eVar.f57088a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57089b, Boolean.valueOf(this.f57090c), this.d, Integer.valueOf(Arrays.hashCode(this.f57088a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.o(parcel, 1, this.f57088a, i7);
        cc.l(parcel, 2, this.f57089b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f57090c ? 1 : 0);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
