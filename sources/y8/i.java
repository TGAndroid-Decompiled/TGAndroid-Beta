package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f61082a;
    public b f61083b;
    public UserAddress f61084c;
    public k d;
    public String f61085e;
    public Bundle f61086f;
    public String h;
    public Bundle f61087n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f61082a);
        cc.k(parcel, 2, this.f61083b, i7);
        cc.k(parcel, 3, this.f61084c, i7);
        cc.k(parcel, 4, this.d, i7);
        cc.l(parcel, 5, this.f61085e);
        cc.b(parcel, 6, this.f61086f);
        cc.l(parcel, 7, this.h);
        cc.b(parcel, 8, this.f61087n);
        cc.s(parcel, r10);
    }
}
