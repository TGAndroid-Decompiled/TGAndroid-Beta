package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f54949a;
    public final String f54950b;
    public final boolean f54951c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.f54949a = gVarArr;
        this.f54950b = str;
        this.f54951c = z9;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f54950b, eVar.f54950b) && q6.m.k(Boolean.valueOf(this.f54951c), Boolean.valueOf(eVar.f54951c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f54949a, eVar.f54949a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54950b, Boolean.valueOf(this.f54951c), this.d, Integer.valueOf(Arrays.hashCode(this.f54949a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 1, this.f54949a, i7);
        xb.l(parcel, 2, this.f54950b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54951c ? 1 : 0);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
