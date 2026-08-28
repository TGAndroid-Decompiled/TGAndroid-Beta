package q5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new o5.p(10);
    public final String f46012a;

    public c(String str) {
        this.f46012a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f46012a, ((c) obj).f46012a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46012a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f46012a);
        p8.r(parcel, q10);
    }
}
