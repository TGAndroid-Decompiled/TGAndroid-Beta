package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f59168a;
    public String f59169b;
    public String f59170c;
    public int d;
    public UserAddress f59171e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f59168a);
        xb.l(parcel, 2, this.f59169b);
        xb.l(parcel, 3, this.f59170c);
        int i10 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 5, this.f59171e, i7);
        xb.s(parcel, r10);
    }
}
