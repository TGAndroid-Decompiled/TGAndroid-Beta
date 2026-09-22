package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new r(1);
    public int f44567a;
    public Bundle f44568b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f44567a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.b(parcel, 3, this.f44568b);
        f0.r(parcel, q6);
    }
}
