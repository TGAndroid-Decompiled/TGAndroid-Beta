package y5;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w8.s;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(28);
    public final boolean f52051a;

    public d(boolean z10) {
        this.f52051a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f52051a != ((d) obj).f52051a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52051a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52051a ? 1 : 0);
        df.r(parcel, q5);
    }
}
