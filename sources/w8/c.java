package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f50429a;
    public d f50430b;
    public f f50431c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f50429a);
        c0.k(parcel, 3, this.f50430b, i10);
        c0.k(parcel, 5, this.f50431c, i10);
        c0.r(parcel, q6);
    }
}
