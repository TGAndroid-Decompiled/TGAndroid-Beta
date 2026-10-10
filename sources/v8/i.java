package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f49507a;
    public b f49508b;
    public UserAddress f49509c;
    public k d;
    public String f49510e;
    public Bundle f49511f;
    public String h;
    public Bundle f49512n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f49507a);
        d0.k(parcel, 2, this.f49508b, i10);
        d0.k(parcel, 3, this.f49509c, i10);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f49510e);
        d0.b(parcel, 6, this.f49511f);
        d0.l(parcel, 7, this.h);
        d0.b(parcel, 8, this.f49512n);
        d0.r(parcel, q6);
    }
}
