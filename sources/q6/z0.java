package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class z0 extends c6.a {
    public static final Parcelable.Creator<z0> CREATOR = new l4.j(20);
    public final boolean f44756a;

    public z0(boolean z4) {
        this.f44756a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f44756a != ((z0) obj).f44756a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44756a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44756a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
