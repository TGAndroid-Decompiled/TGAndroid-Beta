package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(18);
    public String f47301a;
    public String f47302b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f47301a);
        c0.l(parcel, 3, this.f47302b);
        c0.r(parcel, q6);
    }
}
