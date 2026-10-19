package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(24);
    public final g[] f44230a;
    public final String f44231b;
    public final boolean f44232c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f44230a = gVarArr;
        this.f44231b = str;
        this.f44232c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f44231b, eVar.f44231b) && n6.l.l(Boolean.valueOf(this.f44232c), Boolean.valueOf(eVar.f44232c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f44230a, eVar.f44230a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44231b, Boolean.valueOf(this.f44232c), this.d, Integer.valueOf(Arrays.hashCode(this.f44230a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.o(parcel, 1, this.f44230a, i10);
        f0.l(parcel, 2, this.f44231b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44232c ? 1 : 0);
        f0.k(parcel, 4, this.d, i10);
        f0.r(parcel, q6);
    }
}
