package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f61083a;
    public String f61084b;
    public String f61085c;
    public int d;
    public UserAddress f61086e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f61083a);
        bc.l(parcel, 2, this.f61084b);
        bc.l(parcel, 3, this.f61085c);
        int i10 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 5, this.f61086e, i7);
        bc.s(parcel, r10);
    }
}
