package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f47281a;
    public String f47282b;
    public String f47283c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f47281a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 3, this.f47282b);
        c0.l(parcel, 4, this.f47283c);
        c0.l(parcel, 5, this.d);
        c0.r(parcel, q6);
    }
}
