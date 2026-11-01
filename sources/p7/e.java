package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.i(23);
    public final g[] f44863a;
    public final String f44864b;
    public final boolean f44865c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f44863a = gVarArr;
        this.f44864b = str;
        this.f44865c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.k(this.f44864b, eVar.f44864b) && n6.l.k(Boolean.valueOf(this.f44865c), Boolean.valueOf(eVar.f44865c)) && n6.l.k(this.d, eVar.d) && Arrays.equals(this.f44863a, eVar.f44863a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44864b, Boolean.valueOf(this.f44865c), this.d, Integer.valueOf(Arrays.hashCode(this.f44863a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.o(parcel, 1, this.f44863a, i10);
        h0.l(parcel, 2, this.f44864b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f44865c ? 1 : 0);
        h0.k(parcel, 4, this.d, i10);
        h0.r(parcel, q6);
    }
}
