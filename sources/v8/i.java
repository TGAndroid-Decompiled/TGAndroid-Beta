package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f48196a;
    public b f48197b;
    public UserAddress f48198c;
    public k d;
    public String f48199e;
    public Bundle f48200f;
    public String h;
    public Bundle f48201n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f48196a);
        g0.k(parcel, 2, this.f48197b, i10);
        g0.k(parcel, 3, this.f48198c, i10);
        g0.k(parcel, 4, this.d, i10);
        g0.l(parcel, 5, this.f48199e);
        g0.b(parcel, 6, this.f48200f);
        g0.l(parcel, 7, this.h);
        g0.b(parcel, 8, this.f48201n);
        g0.r(parcel, q6);
    }
}
