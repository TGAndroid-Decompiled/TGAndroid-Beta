package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(15);
    public String f47486a;
    public String f47487b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f47486a);
        f0.l(parcel, 3, this.f47487b);
        f0.r(parcel, q6);
    }
}
