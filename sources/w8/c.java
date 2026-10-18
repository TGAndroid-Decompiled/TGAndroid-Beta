package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String f48878a;
    public d f48879b;
    public f f48880c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48878a);
        f0.k(parcel, 3, this.f48879b, i10);
        f0.k(parcel, 5, this.f48880c, i10);
        f0.r(parcel, q6);
    }
}
