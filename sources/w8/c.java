package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f45208a;
    public d f45209b;
    public f f45210c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45208a);
        f0.k(parcel, 3, this.f45209b, i10);
        f0.k(parcel, 5, this.f45210c, i10);
        f0.r(parcel, q6);
    }
}
