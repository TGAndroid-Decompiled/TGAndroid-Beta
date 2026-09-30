package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(21);
    public String f45286a;
    public String f45287b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45286a);
        f0.l(parcel, 3, this.f45287b);
        f0.r(parcel, q6);
    }
}
