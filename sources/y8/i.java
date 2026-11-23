package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f61117a;
    public b f61118b;
    public UserAddress f61119c;
    public k d;
    public String f61120e;
    public Bundle f61121f;
    public String h;
    public Bundle f61122n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f61117a);
        bc.k(parcel, 2, this.f61118b, i7);
        bc.k(parcel, 3, this.f61119c, i7);
        bc.k(parcel, 4, this.d, i7);
        bc.l(parcel, 5, this.f61120e);
        bc.b(parcel, 6, this.f61121f);
        bc.l(parcel, 7, this.h);
        bc.b(parcel, 8, this.f61122n);
        bc.s(parcel, r10);
    }
}
