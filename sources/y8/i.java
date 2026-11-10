package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String f59295a;
    public b f59296b;
    public UserAddress f59297c;
    public k d;
    public String f59298e;
    public Bundle f59299f;
    public String h;
    public Bundle f59300n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f59295a);
        xb.k(parcel, 2, this.f59296b, i7);
        xb.k(parcel, 3, this.f59297c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.l(parcel, 5, this.f59298e);
        xb.b(parcel, 6, this.f59299f);
        xb.l(parcel, 7, this.h);
        xb.b(parcel, 8, this.f59300n);
        xb.s(parcel, r10);
    }
}
