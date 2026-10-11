package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int f49603a;
    public String f49604b;
    public String f49605c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f49603a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 2, this.f49604b);
        d0.l(parcel, 3, this.f49605c);
        d0.r(parcel, q6);
    }
}
