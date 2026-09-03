package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class z0 extends c6.a {
    public static final Parcelable.Creator<z0> CREATOR = new l4.j(20);
    public final boolean f43020a;

    public z0(boolean z4) {
        this.f43020a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f43020a != ((z0) obj).f43020a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f43020a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f43020a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
