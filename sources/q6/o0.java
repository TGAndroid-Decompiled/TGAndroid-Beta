package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class o0 extends c6.a {
    public static final Parcelable.Creator<o0> CREATOR = new l4.j(24);
    public final String f42968a;

    public o0(String str) {
        b6.m.h(str);
        this.f42968a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f42968a.equals(((o0) obj).f42968a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42968a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f42968a);
        f5.r(parcel, q10);
    }
}
