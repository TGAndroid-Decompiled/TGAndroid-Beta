package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(7);
    public String f47713a;
    public String f47714b;
    public String f47715c;
    public int d;
    public UserAddress f47716e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f47713a);
        e0.l(parcel, 2, this.f47714b);
        e0.l(parcel, 3, this.f47715c);
        int i11 = this.d;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.k(parcel, 5, this.f47716e, i10);
        e0.r(parcel, q6);
    }
}
