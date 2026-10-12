package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new r(17);
    public String f50424a;
    public String f50425b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f50424a);
        c0.l(parcel, 3, this.f50425b);
        c0.r(parcel, q6);
    }
}
