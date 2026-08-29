package s5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o6.w0;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new w0(22);
    public final String f47583a;

    public c(String str) {
        this.f47583a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f47583a, ((c) obj).f47583a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47583a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f47583a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
