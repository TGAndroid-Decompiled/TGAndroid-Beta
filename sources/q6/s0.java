package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class s0 extends c6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(5);
    public final String f42958a;

    public s0(String str) {
        this.f42958a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return b6.m.l(this.f42958a, ((s0) obj).f42958a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42958a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f42958a);
        f5.r(parcel, q10);
    }
}
