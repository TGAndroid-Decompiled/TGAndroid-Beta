package u5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import r5.c0;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(14);
    public final String f45101a;

    public c(String str) {
        this.f45101a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f45101a, ((c) obj).f45101a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45101a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f45101a);
        f5.r(parcel, q10);
    }
}
