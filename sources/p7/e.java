package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(26);
    public final g[] f45515a;
    public final String f45516b;
    public final boolean f45517c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f45515a = gVarArr;
        this.f45516b = str;
        this.f45517c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (n6.m.l(this.f45516b, eVar.f45516b) && n6.m.l(Boolean.valueOf(this.f45517c), Boolean.valueOf(eVar.f45517c)) && n6.m.l(this.d, eVar.d) && Arrays.equals(this.f45515a, eVar.f45515a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45516b, Boolean.valueOf(this.f45517c), this.d, Integer.valueOf(Arrays.hashCode(this.f45515a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.o(parcel, 1, this.f45515a, i10);
        d0.l(parcel, 2, this.f45516b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45517c ? 1 : 0);
        d0.k(parcel, 4, this.d, i10);
        d0.r(parcel, q6);
    }
}
