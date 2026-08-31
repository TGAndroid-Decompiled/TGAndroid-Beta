package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class o0 extends c6.a {
    public static final Parcelable.Creator<o0> CREATOR = new l4.j(24);
    public final String f44701a;

    public o0(String str) {
        b6.m.h(str);
        this.f44701a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f44701a.equals(((o0) obj).f44701a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44701a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f44701a);
        g5.r(parcel, q10);
    }
}
