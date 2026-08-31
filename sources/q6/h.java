package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(15);
    public final boolean f44675a;

    public h(boolean z4) {
        this.f44675a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f44675a != ((h) obj).f44675a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44675a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44675a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
