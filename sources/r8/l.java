package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f47297a;
    public String f47298b;
    public int f47299c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f47297a);
        c0.l(parcel, 3, this.f47298b);
        int i11 = this.f47299c;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        c0.r(parcel, q6);
    }
}
