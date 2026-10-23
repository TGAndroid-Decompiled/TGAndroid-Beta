package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(19);
    public String f48895a;
    public String f48896b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48895a);
        f0.l(parcel, 3, this.f48896b);
        f0.r(parcel, q6);
    }
}
