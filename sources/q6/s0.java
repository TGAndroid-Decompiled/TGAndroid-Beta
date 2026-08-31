package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class s0 extends c6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(5);
    public final String f44722a;

    public s0(String str) {
        this.f44722a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return b6.m.l(this.f44722a, ((s0) obj).f44722a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44722a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f44722a);
        g5.r(parcel, q10);
    }
}
