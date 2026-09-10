package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f39820a;
    public final String f39821b;
    public final boolean f39822c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f39820a = gVarArr;
        this.f39821b = str;
        this.f39822c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f39821b, eVar.f39821b) && n6.l.l(Boolean.valueOf(this.f39822c), Boolean.valueOf(eVar.f39822c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f39820a, eVar.f39820a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39821b, Boolean.valueOf(this.f39822c), this.d, Integer.valueOf(Arrays.hashCode(this.f39820a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 1, this.f39820a, i10);
        e0.l(parcel, 2, this.f39821b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f39822c ? 1 : 0);
        e0.k(parcel, 4, this.d, i10);
        e0.r(parcel, q6);
    }
}
