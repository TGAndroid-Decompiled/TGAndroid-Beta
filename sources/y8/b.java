package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f59265a;
    public String f59266b;
    public String f59267c;
    public int d;
    public UserAddress f59268e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f59265a);
        xb.l(parcel, 2, this.f59266b);
        xb.l(parcel, 3, this.f59267c);
        int i10 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 5, this.f59268e, i7);
        xb.s(parcel, r10);
    }
}
