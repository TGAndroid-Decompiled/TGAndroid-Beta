package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String f61042a;
    public String f61043b;
    public String f61044c;
    public int d;
    public UserAddress f61045e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f61042a);
        bc.l(parcel, 2, this.f61043b);
        bc.l(parcel, 3, this.f61044c);
        int i10 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 5, this.f61045e, i7);
        bc.s(parcel, r10);
    }
}
