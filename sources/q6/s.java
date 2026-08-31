package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(27);
    public final String f44721a;

    public s(String str) {
        b6.m.h(str);
        this.f44721a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f44721a.equals(((s) obj).f44721a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44721a});
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("FidoAppIdExtension{appid='"), this.f44721a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44721a);
        g5.r(parcel, q10);
    }
}
