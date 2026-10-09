package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new r(1);
    public int f49477a;
    public Bundle f49478b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f49477a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.b(parcel, 3, this.f49478b);
        d0.r(parcel, q6);
    }
}
