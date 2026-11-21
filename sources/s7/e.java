package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f57119a;
    public final String f57120b;
    public final boolean f57121c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f57119a = gVarArr;
        this.f57120b = str;
        this.f57121c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.l(this.f57120b, eVar.f57120b) && q6.m.l(Boolean.valueOf(this.f57121c), Boolean.valueOf(eVar.f57121c)) && q6.m.l(this.d, eVar.d) && Arrays.equals(this.f57119a, eVar.f57119a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57120b, Boolean.valueOf(this.f57121c), this.d, Integer.valueOf(Arrays.hashCode(this.f57119a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 1, this.f57119a, i7);
        bc.l(parcel, 2, this.f57120b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57121c ? 1 : 0);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
