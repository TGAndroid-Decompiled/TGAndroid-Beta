package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f45372a;
    public final String f45373b;
    public final boolean f45374c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f45372a = gVarArr;
        this.f45373b = str;
        this.f45374c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.m.l(this.f45373b, eVar.f45373b) && n6.m.l(Boolean.valueOf(this.f45374c), Boolean.valueOf(eVar.f45374c)) && n6.m.l(this.d, eVar.d) && Arrays.equals(this.f45372a, eVar.f45372a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45373b, Boolean.valueOf(this.f45374c), this.d, Integer.valueOf(Arrays.hashCode(this.f45372a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.o(parcel, 1, this.f45372a, i10);
        c0.l(parcel, 2, this.f45373b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45374c ? 1 : 0);
        c0.k(parcel, 4, this.d, i10);
        c0.r(parcel, q6);
    }
}
