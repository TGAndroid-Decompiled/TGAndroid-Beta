package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f42450a;
    public String f42451b;
    public String f42452c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42450a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42451b);
        f0.l(parcel, 4, this.f42452c);
        f0.l(parcel, 5, this.d);
        f0.r(parcel, q6);
    }
}
