package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f61171a;
    public String f61172b;
    public String f61173c;
    public int d;
    public UserAddress f61174e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f61171a);
        cc.l(parcel, 2, this.f61172b);
        cc.l(parcel, 3, this.f61173c);
        int i10 = this.d;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.k(parcel, 5, this.f61174e, i7);
        cc.s(parcel, r10);
    }
}
