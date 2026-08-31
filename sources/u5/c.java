package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import r5.c0;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(14);
    public final String f48352a;

    public c(String str) {
        this.f48352a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f48352a, ((c) obj).f48352a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48352a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f48352a);
        g5.r(parcel, q10);
    }
}
