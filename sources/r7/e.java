package r7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new q8.i(1);
    public final g[] f54404a;
    public final String f54405b;
    public final boolean f54406c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f54404a = gVarArr;
        this.f54405b = str;
        this.f54406c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (p6.m.k(this.f54405b, eVar.f54405b) && p6.m.k(Boolean.valueOf(this.f54406c), Boolean.valueOf(eVar.f54406c)) && p6.m.k(this.d, eVar.d) && Arrays.equals(this.f54404a, eVar.f54404a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54405b, Boolean.valueOf(this.f54406c), this.d, Integer.valueOf(Arrays.hashCode(this.f54404a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.p(parcel, 1, this.f54404a, i3);
        j8.a.m(parcel, 2, this.f54405b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f54406c ? 1 : 0);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.t(parcel, s6);
    }
}
