package z6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new w7.i(18);
    public final g[] f50311a;
    public final String f50312b;
    public final boolean f50313c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f50311a = gVarArr;
        this.f50312b = str;
        this.f50313c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (x5.l.l(this.f50312b, eVar.f50312b) && x5.l.l(Boolean.valueOf(this.f50313c), Boolean.valueOf(eVar.f50313c)) && x5.l.l(this.d, eVar.d) && Arrays.equals(this.f50311a, eVar.f50311a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50312b, Boolean.valueOf(this.f50313c), this.d, Integer.valueOf(Arrays.hashCode(this.f50311a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.o(parcel, 1, this.f50311a, i9);
        p8.l(parcel, 2, this.f50312b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f50313c ? 1 : 0);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }
}
