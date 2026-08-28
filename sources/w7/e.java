package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new j(26);
    public final String f48774a;

    public e(String str) {
        this.f48774a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f48774a);
        p8.r(parcel, q10);
    }
}
