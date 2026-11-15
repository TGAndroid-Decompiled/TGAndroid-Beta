package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f56504a;
    public final String f56505b;
    public final boolean f56506c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f56504a = gVarArr;
        this.f56505b = str;
        this.f56506c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f56505b, eVar.f56505b) && q6.m.k(Boolean.valueOf(this.f56506c), Boolean.valueOf(eVar.f56506c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f56504a, eVar.f56504a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56505b, Boolean.valueOf(this.f56506c), this.d, Integer.valueOf(Arrays.hashCode(this.f56504a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.o(parcel, 1, this.f56504a, i7);
        yb.l(parcel, 2, this.f56505b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f56506c ? 1 : 0);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
