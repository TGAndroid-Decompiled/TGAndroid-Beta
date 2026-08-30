package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new l4.j(23);
    public final boolean f42959a;

    public t(boolean z4) {
        this.f42959a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f42959a != ((t) obj).f42959a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42959a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42959a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
