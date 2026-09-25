package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f45172a;
    public d f45173b;
    public f f45174c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45172a);
        f0.k(parcel, 3, this.f45173b, i10);
        f0.k(parcel, 5, this.f45174c, i10);
        f0.r(parcel, q6);
    }
}
