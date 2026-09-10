package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(7);
    public String f43226a;
    public String f43227b;
    public String f43228c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43226a);
        e0.l(parcel, 2, this.f43227b);
        e0.l(parcel, 3, this.f43228c);
        int i11 = this.d;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.k(parcel, 5, this.e, i10);
        e0.r(parcel, q6);
    }
}
