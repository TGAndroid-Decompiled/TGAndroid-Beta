package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(19);
    public int f45910a;
    public String f45911b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45910a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f45911b);
        g0.r(parcel, q6);
    }
}
