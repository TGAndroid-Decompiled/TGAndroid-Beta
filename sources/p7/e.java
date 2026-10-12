package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f45367a;
    public final String f45368b;
    public final boolean f45369c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f45367a = gVarArr;
        this.f45368b = str;
        this.f45369c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.m.l(this.f45368b, eVar.f45368b) && n6.m.l(Boolean.valueOf(this.f45369c), Boolean.valueOf(eVar.f45369c)) && n6.m.l(this.d, eVar.d) && Arrays.equals(this.f45367a, eVar.f45367a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45368b, Boolean.valueOf(this.f45369c), this.d, Integer.valueOf(Arrays.hashCode(this.f45367a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.o(parcel, 1, this.f45367a, i10);
        c0.l(parcel, 2, this.f45368b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45369c ? 1 : 0);
        c0.k(parcel, 4, this.d, i10);
        c0.r(parcel, q6);
    }
}
