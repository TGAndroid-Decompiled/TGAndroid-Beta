package r5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import n6.w0;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new w0(18);

    public final String f46771a;

    public c(String str) {
        this.f46771a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return a.d(this.f46771a, ((c) obj).f46771a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46771a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f46771a);
        r8.r(parcel, iQ);
    }
}
