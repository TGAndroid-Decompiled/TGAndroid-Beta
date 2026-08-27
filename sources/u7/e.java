package u7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import r6.l;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new l(22);

    public final String f48441a;

    public e(String str) {
        y5.l.i(str, "json must not be null");
        this.f48441a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f48441a);
        r8.r(parcel, iQ);
    }
}
