package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f43959a;
    public final String f43960b;
    public final boolean f43961c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f43959a = gVarArr;
        this.f43960b = str;
        this.f43961c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f43960b, eVar.f43960b) && n6.l.l(Boolean.valueOf(this.f43961c), Boolean.valueOf(eVar.f43961c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f43959a, eVar.f43959a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43960b, Boolean.valueOf(this.f43961c), this.d, Integer.valueOf(Arrays.hashCode(this.f43959a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 1, this.f43959a, i10);
        e0.l(parcel, 2, this.f43960b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43961c ? 1 : 0);
        e0.k(parcel, 4, this.d, i10);
        e0.r(parcel, q6);
    }
}
