package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f44308a;
    public final String f44309b;
    public final boolean f44310c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f44308a = gVarArr;
        this.f44309b = str;
        this.f44310c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f44309b, eVar.f44309b) && n6.l.l(Boolean.valueOf(this.f44310c), Boolean.valueOf(eVar.f44310c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f44308a, eVar.f44308a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44309b, Boolean.valueOf(this.f44310c), this.d, Integer.valueOf(Arrays.hashCode(this.f44308a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.o(parcel, 1, this.f44308a, i10);
        g0.l(parcel, 2, this.f44309b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44310c ? 1 : 0);
        g0.k(parcel, 4, this.d, i10);
        g0.r(parcel, q6);
    }
}
