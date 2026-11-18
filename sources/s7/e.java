package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f57078a;
    public final String f57079b;
    public final boolean f57080c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f57078a = gVarArr;
        this.f57079b = str;
        this.f57080c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.l(this.f57079b, eVar.f57079b) && q6.m.l(Boolean.valueOf(this.f57080c), Boolean.valueOf(eVar.f57080c)) && q6.m.l(this.d, eVar.d) && Arrays.equals(this.f57078a, eVar.f57078a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57079b, Boolean.valueOf(this.f57080c), this.d, Integer.valueOf(Arrays.hashCode(this.f57078a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 1, this.f57078a, i7);
        bc.l(parcel, 2, this.f57079b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57080c ? 1 : 0);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
