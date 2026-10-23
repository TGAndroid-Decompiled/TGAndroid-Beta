package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String f49326a;
    public d f49327b;
    public f f49328c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f49326a);
        f0.k(parcel, 3, this.f49327b, i10);
        f0.k(parcel, 5, this.f49328c, i10);
        f0.r(parcel, q6);
    }
}
