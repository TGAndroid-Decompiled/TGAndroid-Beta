package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new x(22);
    public final boolean f54869a;

    public l(boolean z9) {
        this.f54869a = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f54869a == ((l) obj).f54869a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f54869a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f54869a ? 1 : 0);
        wb.s(parcel, r10);
    }
}
