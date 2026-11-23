package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f57202a;
    public final String f57203b;
    public final boolean f57204c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f57202a = gVarArr;
        this.f57203b = str;
        this.f57204c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.l(this.f57203b, eVar.f57203b) && q6.m.l(Boolean.valueOf(this.f57204c), Boolean.valueOf(eVar.f57204c)) && q6.m.l(this.d, eVar.d) && Arrays.equals(this.f57202a, eVar.f57202a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57203b, Boolean.valueOf(this.f57204c), this.d, Integer.valueOf(Arrays.hashCode(this.f57202a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.o(parcel, 1, this.f57202a, i7);
        cc.l(parcel, 2, this.f57203b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f57204c ? 1 : 0);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
