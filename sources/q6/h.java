package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(15);
    public final boolean f42913a;

    public h(boolean z4) {
        this.f42913a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f42913a != ((h) obj).f42913a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42913a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42913a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
