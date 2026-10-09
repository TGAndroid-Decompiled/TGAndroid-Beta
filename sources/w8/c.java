package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f50192a;
    public d f50193b;
    public f f50194c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50192a);
        d0.k(parcel, 3, this.f50193b, i10);
        d0.k(parcel, 5, this.f50194c, i10);
        d0.r(parcel, q6);
    }
}
