package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f48195a;
    public b f48196b;
    public UserAddress f48197c;
    public k d;
    public String f48198e;
    public Bundle f48199f;
    public String h;
    public Bundle f48200n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f48195a);
        g0.k(parcel, 2, this.f48196b, i10);
        g0.k(parcel, 3, this.f48197c, i10);
        g0.k(parcel, 4, this.d, i10);
        g0.l(parcel, 5, this.f48198e);
        g0.b(parcel, 6, this.f48199f);
        g0.l(parcel, 7, this.h);
        g0.b(parcel, 8, this.f48200n);
        g0.r(parcel, q6);
    }
}
