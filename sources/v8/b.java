package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(7);
    public String f49433a;
    public String f49434b;
    public String f49435c;
    public int d;
    public UserAddress f49436e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f49433a);
        d0.l(parcel, 2, this.f49434b);
        d0.l(parcel, 3, this.f49435c);
        int i11 = this.d;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        d0.k(parcel, 5, this.f49436e, i10);
        d0.r(parcel, q6);
    }
}
