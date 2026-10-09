package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f49461a;
    public b f49462b;
    public UserAddress f49463c;
    public k d;
    public String f49464e;
    public Bundle f49465f;
    public String h;
    public Bundle f49466n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f49461a);
        d0.k(parcel, 2, this.f49462b, i10);
        d0.k(parcel, 3, this.f49463c, i10);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f49464e);
        d0.b(parcel, 6, this.f49465f);
        d0.l(parcel, 7, this.h);
        d0.b(parcel, 8, this.f49466n);
        d0.r(parcel, q6);
    }
}
