package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f61071a;
    public b f61072b;
    public UserAddress f61073c;
    public k d;
    public String f61074e;
    public Bundle f61075f;
    public String h;
    public Bundle f61076n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f61071a);
        bc.k(parcel, 2, this.f61072b, i7);
        bc.k(parcel, 3, this.f61073c, i7);
        bc.k(parcel, 4, this.d, i7);
        bc.l(parcel, 5, this.f61074e);
        bc.b(parcel, 6, this.f61075f);
        bc.l(parcel, 7, this.h);
        bc.b(parcel, 8, this.f61076n);
        bc.s(parcel, r10);
    }
}
