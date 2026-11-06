package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q4.x;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] f54820a;
    public final String f54821b;
    public final boolean f54822c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.f54820a = gVarArr;
        this.f54821b = str;
        this.f54822c = z9;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.f54821b, eVar.f54821b) && q6.m.k(Boolean.valueOf(this.f54822c), Boolean.valueOf(eVar.f54822c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.f54820a, eVar.f54820a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54821b, Boolean.valueOf(this.f54822c), this.d, Integer.valueOf(Arrays.hashCode(this.f54820a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.o(parcel, 1, this.f54820a, i7);
        wb.l(parcel, 2, this.f54821b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54822c ? 1 : 0);
        wb.k(parcel, 4, this.d, i7);
        wb.s(parcel, r10);
    }
}
