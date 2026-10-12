package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new r(0);
    public int f49713a;
    public String f49714b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f49713a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 3, this.f49714b);
        c0.r(parcel, q6);
    }
}
