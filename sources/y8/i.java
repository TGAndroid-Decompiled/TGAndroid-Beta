package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f61201a;
    public b f61202b;
    public UserAddress f61203c;
    public k d;
    public String f61204e;
    public Bundle f61205f;
    public String h;
    public Bundle f61206n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f61201a);
        cc.k(parcel, 2, this.f61202b, i7);
        cc.k(parcel, 3, this.f61203c, i7);
        cc.k(parcel, 4, this.d, i7);
        cc.l(parcel, 5, this.f61204e);
        cc.b(parcel, 6, this.f61205f);
        cc.l(parcel, 7, this.h);
        cc.b(parcel, 8, this.f61206n);
        cc.s(parcel, r10);
    }
}
