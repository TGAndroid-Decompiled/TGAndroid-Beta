package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.e0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
    public String f43253a;
    public b f43254b;
    public UserAddress f43255c;
    public k d;
    public String e;
    public Bundle f43256f;
    public String h;
    public Bundle f43257n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f43253a);
        e0.k(parcel, 2, this.f43254b, i10);
        e0.k(parcel, 3, this.f43255c, i10);
        e0.k(parcel, 4, this.d, i10);
        e0.l(parcel, 5, this.e);
        e0.b(parcel, 6, this.f43256f);
        e0.l(parcel, 7, this.h);
        e0.b(parcel, 8, this.f43257n);
        e0.r(parcel, q6);
    }
}
