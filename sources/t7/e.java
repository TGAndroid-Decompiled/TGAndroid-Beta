package t7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
import x5.l;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new j(13);
    public final String f47719a;

    public e(String str) {
        l.i(str, "json must not be null");
        this.f47719a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f47719a);
        p8.r(parcel, q10);
    }
}
