package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.i(23);
    public final g[] f44852a;
    public final String f44853b;
    public final boolean f44854c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f44852a = gVarArr;
        this.f44853b = str;
        this.f44854c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.k(this.f44853b, eVar.f44853b) && n6.l.k(Boolean.valueOf(this.f44854c), Boolean.valueOf(eVar.f44854c)) && n6.l.k(this.d, eVar.d) && Arrays.equals(this.f44852a, eVar.f44852a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44853b, Boolean.valueOf(this.f44854c), this.d, Integer.valueOf(Arrays.hashCode(this.f44852a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.o(parcel, 1, this.f44852a, i10);
        h0.l(parcel, 2, this.f44853b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f44854c ? 1 : 0);
        h0.k(parcel, 4, this.d, i10);
        h0.r(parcel, q6);
    }
}
