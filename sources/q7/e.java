package q7;

import a8.df;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(24);
    public final g[] f46981a;
    public final String f46982b;
    public final boolean f46983c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f46981a = gVarArr;
        this.f46982b = str;
        this.f46983c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (o6.l.l(this.f46982b, eVar.f46982b) && o6.l.l(Boolean.valueOf(this.f46983c), Boolean.valueOf(eVar.f46983c)) && o6.l.l(this.d, eVar.d) && Arrays.equals(this.f46981a, eVar.f46981a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46982b, Boolean.valueOf(this.f46983c), this.d, Integer.valueOf(Arrays.hashCode(this.f46981a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.o(parcel, 1, this.f46981a, i10);
        df.l(parcel, 2, this.f46982b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f46983c ? 1 : 0);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
