package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(4);
    public String f50673a;
    public String f50674b;
    public String f50675c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f50673a);
        h0.l(parcel, 2, this.f50674b);
        h0.l(parcel, 3, this.f50675c);
        int i11 = this.d;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.k(parcel, 5, this.e, i10);
        h0.r(parcel, q6);
    }
}
