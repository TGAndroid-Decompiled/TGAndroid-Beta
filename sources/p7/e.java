package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f43986a;
    public final String f43987b;
    public final boolean f43988c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f43986a = gVarArr;
        this.f43987b = str;
        this.f43988c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.l.l(this.f43987b, eVar.f43987b) && n6.l.l(Boolean.valueOf(this.f43988c), Boolean.valueOf(eVar.f43988c)) && n6.l.l(this.d, eVar.d) && Arrays.equals(this.f43986a, eVar.f43986a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43987b, Boolean.valueOf(this.f43988c), this.d, Integer.valueOf(Arrays.hashCode(this.f43986a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 1, this.f43986a, i10);
        e0.l(parcel, 2, this.f43987b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43988c ? 1 : 0);
        e0.k(parcel, 4, this.d, i10);
        e0.r(parcel, q6);
    }
}
