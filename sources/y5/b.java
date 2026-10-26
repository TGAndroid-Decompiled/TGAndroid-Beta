package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(26);
    public final boolean f52046a;
    public final String f52047b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f52046a = z10;
        this.f52047b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f52046a == bVar.f52046a && l.l(this.f52047b, bVar.f52047b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52046a), this.f52047b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52046a ? 1 : 0);
        df.l(parcel, 2, this.f52047b);
        df.r(parcel, q5);
    }
}
