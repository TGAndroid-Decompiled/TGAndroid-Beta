package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f49718a;
    public String f49719b;
    public String f49720c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f49718a;
        c0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 2, this.f49719b);
        c0.l(parcel, 3, this.f49720c);
        c0.r(parcel, q6);
    }
}
