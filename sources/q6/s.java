package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(27);
    public final String f42957a;

    public s(String str) {
        b6.m.h(str);
        this.f42957a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f42957a.equals(((s) obj).f42957a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42957a});
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("FidoAppIdExtension{appid='"), this.f42957a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42957a);
        f5.r(parcel, q10);
    }
}
