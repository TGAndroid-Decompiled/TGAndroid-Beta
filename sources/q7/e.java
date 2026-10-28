package q7;

import a8.df;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(24);
    public final g[] f47019a;
    public final String f47020b;
    public final boolean f47021c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f47019a = gVarArr;
        this.f47020b = str;
        this.f47021c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (o6.l.l(this.f47020b, eVar.f47020b) && o6.l.l(Boolean.valueOf(this.f47021c), Boolean.valueOf(eVar.f47021c)) && o6.l.l(this.d, eVar.d) && Arrays.equals(this.f47019a, eVar.f47019a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47020b, Boolean.valueOf(this.f47021c), this.d, Integer.valueOf(Arrays.hashCode(this.f47019a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.o(parcel, 1, this.f47019a, i10);
        df.l(parcel, 2, this.f47020b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f47021c ? 1 : 0);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
