package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f54845a;
    public final String f54846b;
    public final boolean f54847c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.f54845a = gVarArr;
        this.f54846b = str;
        this.f54847c = z9;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f54846b, eVar.f54846b) && q6.m.k(Boolean.valueOf(this.f54847c), Boolean.valueOf(eVar.f54847c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f54845a, eVar.f54845a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54846b, Boolean.valueOf(this.f54847c), this.d, Integer.valueOf(Arrays.hashCode(this.f54845a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.o(parcel, 1, this.f54845a, i7);
        wb.l(parcel, 2, this.f54846b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54847c ? 1 : 0);
        wb.k(parcel, 4, this.d, i7);
        wb.s(parcel, r10);
    }
}
