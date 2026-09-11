package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String f45005a;
    public String f45006b;
    public String f45007c;
    public String d;
    public String f45008e;
    public String f45009f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f45005a);
        e0.l(parcel, 3, this.f45006b);
        e0.l(parcel, 4, this.f45007c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.f45008e);
        e0.l(parcel, 7, this.f45009f);
        e0.l(parcel, 8, this.h);
        e0.r(parcel, q6);
    }
}
